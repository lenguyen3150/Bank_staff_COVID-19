library(tidyverse)
library(ggridges)

###############################################################################
#Figure 2a: Impact of bank staff usage on the cumulative number of infected residents 

d3_B_Const <- subset(d3, Network == "B" & IP == "Const" & fShared != 0
                     &(Compliance != 0.2 & Compliance != 0.6))

p3_B_Const <- ggplot(d3_B_Const, aes(fill = factor(fShared), y = pIr90, x = factor(Compliance))) +
  geom_hline(yintercept = 32, colour ="red", linetype = "dashed") + 
  geom_flat_violin(adjust = 2, trim = FALSE, alpha = 0.5,
                   position = position_nudge(x = 0.17, y = 0))+
  geom_boxplot(outlier.shape = NA, alpha = 0.2, width = 0.3, colour = "BLACK") +
  theme(text = element_text(size = 12)) +
  theme_light() +
  ylab("Cumulative number of infections per 1,000 residents after 90 days") + 
  xlab("Compliance to weekly PCR testing in bank/agency staff") +
  ggtitle("A: Impact on the number of resident infections") +
  theme(plot.title = element_text(face = "bold")) +
  theme(text = element_text(size = 14)) +
  ylim(min = 0, max = 420) + 
  scale_fill_brewer(palette = "Dark2") + 
  theme(legend.position = "bottom") +
  labs(fill = "Proportion of bank/agency staff") + coord_flip() 

###############################################################################
#Figure 2b: Impact of bank staff usage on the risk of outbreaks across care homes

d3ob_B_Const <- subset(d3ob, Network == "B" & IP == "Const" & Bank_Staff != 0
                       &(Compliance != 0.2 & Compliance != 0.6))
d3ob_B_Const$Compliance <- factor(d3ob_B_Const$Compliance,
                                  levels = c(0.8, 0.4, 0))

p3_ob_B_Const <- ggplot(data = d3ob_B_Const, 
                        mapping = aes(x=factor(Cum_Homes),y=pOb90, colour = factor(Bank_Staff))) +
  geom_point(size = 1.75, position = position_dodge(width = 0.5)) +
  geom_linerange(aes(ymin = CI90_lower, ymax = pOb90 + CI90), width = 0.02,
                 position = position_dodge(width = 0.5))+
  xlab("Cumulative number of care homes with outbreaks") + 
  ylab("Probability of x care home(s) experiencing outbreaks within 90 days (%)") +
  theme_light()+ theme(text = element_text(size = 14)) + 
  theme(legend.position = "bottom") +
  labs(colour = "Proportion of bank/agency staff") +
  scale_colour_brewer(palette = "Dark2") + 
  theme(strip.text = element_text(color = "black")) + 
  facet_grid(Compliance ~., labeller = label_both) +
  ggtitle("B: Impact on the risk of outbreaks") +
  theme(plot.title = element_text(face = "bold")) 

###############################################################################
#Figure 2: Combine Figure 2a & 2b

p3_usage_combine <- ggarrange(p3_B_Const, p3_ob_B_Const, nrow = 1,
                              common.legend = TRUE, legend = "bottom")
