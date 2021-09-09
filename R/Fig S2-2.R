library(tidyverse)
library(ggridges)
library(ggpubr)
###############################################################################
#Figure S2-2A: Time series of Covid-19 prevalence among residents with different IP
d0_ave$IPNew <- factor(d0_ave$IP, 
                       levels = c("Beta (2, 117)", "Beta (5, 266)", "Const"))

p0_ave <- ggplot() + 
  geom_point(data = d0_ave, aes(x = Day, y = Median, colour = IPNew), shape = 1) +
  theme_light() + theme(text = element_text(size = 14)) + 
  ylab("Average number of infected residents") +
  xlab("Time (days)") + 
  ggtitle("A:") +
  theme(plot.title = element_text(face = "bold")) +
  theme(legend.position = "bottom") +
  labs(colour = "Intra-facility transmission risk") + 
  scale_colour_manual(values = c("#377EB8", "#4DAF4A", "#E41A1C"))

###############################################################################
#Figure S2-2B: Time series of cumulative number of infected residents after 90 days
#with different IP

d0_A <- subset(d0, Network == "A") 
d0_A$IPNew <- factor(d0_A$IP, levels = c("Const", "Beta (5, 266)", "Beta (2, 117)"))

p0_A <- ggplot(d0_A, aes(x = 0, y = pIr90, fill = IPNew)) +
  geom_flat_violin(adjust = 2, trim = FALSE, alpha = 0.5,
                   position = position_nudge(x = 0.1, y = 0))+
  geom_boxplot(outlier.shape = NA, alpha = 0.3, width = .1, colour = "BLACK") +
  theme(text = element_text(size = 14)) +
  theme_light() +
  ylab("Cumulative number of infections per 1,000 residents after 90 days") +  
  xlab("") + ggtitle("B:") +
  theme(plot.title = element_text(face = "bold")) +
  theme(text = element_text(size = 14)) +
  ylim(min = 0, max = 480) + 
  theme(strip.text = element_text(colour = "black")) +
  labs(fill = "Intra-facility transmission risk") +
  theme(legend.position = "bottom") +
  guides(fill = guide_legend(reverse = TRUE)) + 
  scale_x_continuous(labels = NULL, breaks = NULL) +
  scale_colour_brewer(palette = "Set1") +
  coord_flip()

###############################################################################
#Figure S2-2:
p_calibrated_IP <- ggarrange(p0_ave, p0_A, nrow = 2)



