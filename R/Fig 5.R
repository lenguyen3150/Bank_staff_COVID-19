library(tidyverse)
library(ggridges)
library(ggpubr)
###############################################################################
# Figure 5A: Impact of staff shortage on the risk of outbreaks
d <- subset(d5ob, Network == "A" & IP == "Const")

p5_ob <- ggplot(data = d, 
                        mapping = aes(x=factor(Cum_Homes),y=pOb90, colour = factor(pShortage))) +
  geom_point(size = 1.75, position = position_dodge(width = 0.5)) +
  geom_linerange(aes(ymin = CI90_lower, ymax = pOb90 + CI90), width = 0.02,
                 position = position_dodge(width = 0.5))+
  ylim(min = 0, max = 100) +
  xlab("Cumulative number of care homes with outbreaks") + 
  ylab("Probability of x care home(s) experiencing outbreaks within 90 days (%)") +
  theme_light()+ theme(text = element_text(size = 12)) + 
  theme(legend.position = "bottom") +
  labs(colour = "Staffing shortage") +
  scale_colour_brewer(palette = "Dark2") + 
  theme(strip.text = element_text(color = "black")) +
  ggtitle("A: Care homes are understaffed")

###############################################################################
# Figure 5B: Impact of staff staff use on the risk of outbreaks
d <-subset(d3a_ob, Network == "A" & IP == "Const")

p3_ob <- ggplot(data = d, 
                        mapping = aes(x=factor(Cum_Homes),y=pOb90, colour = factor(Bank_staff))) +
  geom_point(size = 1.75, position = position_dodge(width = 0.5)) +
  geom_linerange(aes(ymin = CI90_lower, ymax = pOb90 + CI90), width = 0.02,
                 position = position_dodge(width = 0.5))+
  xlab("Cumulative number of care homes with outbreaks") + 
  theme_light()+ theme(text = element_text(size = 12)) + 
  ylim(min = 0, max = 100) +
  theme(legend.position = "bottom") +
  labs(colour = "Proportion of bank/agency staff") +
  scale_colour_brewer(palette = "Dark2") + 
  theme(strip.text = element_text(color = "black")) +
  ggtitle("B: Care homes use bank/agency staff") +
  theme(axis.title.y = element_blank(),
        axis.text.y = element_blank()) 


###############################################################################
# Figure 5: Combine Figure 5A and 5B
p5ob <- ggarrange(p5_ob, p3_ob, nrow = 1, ncol = 2)
