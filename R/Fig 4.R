library(tidyverse)
library(ggridges)
library(ggpubr)
###############################################################################
# Figure 4A: Impact of staff shortage on the cumulative number of infected residents
d <- subset(d5, Network == "A" & IP == "Const")

p5_A <- ggplot(d, aes(fill = factor(pShortage), y = pIr90, x=0)) +
  geom_flat_violin(aes(fill = factor(pShortage)),adjust = 2, trim = FALSE, alpha = 0.5,
                   position = position_nudge(x = 0.1, y = 0))+
  geom_boxplot(outlier.shape = NA, alpha = 0.3, width = .1, colour = "BLACK") +
  theme(text = element_text(size = 12)) +
  theme_light() +
  ylab("Cumulative number of infections per 1,000 residents after 90 days") + 
  xlab("") +
  theme(text = element_text(size = 12)) +
  ylim(min = 0, max = 170) + 
  scale_fill_brewer(palette = "Dark2") + 
  theme(legend.position = "bottom") +
  labs(fill = "Staffing shortage") + coord_flip() +
  scale_x_continuous(labels = NULL, breaks = NULL) + 
  ggtitle("A: Care homes are understaffed")


###############################################################################
# Figure 4B: Impact of staff staff use on the cumulative number of infected residents
d <-subset(d3a, Network == "A" & IP == "Const")

p3_A <- ggplot(d, aes(fill = factor(fShared), y = pIr90, x=0)) +
  geom_flat_violin(aes(fill = factor(fShared)),adjust = 2, trim = FALSE, alpha = 0.5,
                   position = position_nudge(x = 0.1, y = 0))+
  geom_boxplot(outlier.shape = NA, alpha = 0.3, width = .1, colour = "BLACK") +
  theme(text = element_text(size = 12)) +
  theme_light() +
  ylab("Cumulative number of infections per 1,000 residents after 90 days") + 
  xlab("") +
  theme(text = element_text(size = 12)) +
  ylim(min = 0, max = 170) + 
  scale_fill_brewer(palette = "Dark2") + 
  theme(legend.position = "bottom") +
  labs(fill = "Proportion of bank/agency staff") + coord_flip() +
  scale_x_continuous(labels = NULL, breaks = NULL) + 
  ggtitle("B: Care homes use bank/agency staff")

###############################################################################
# Figure 4: Combine Figure 4A and 4B
p5 <- ggarrange(p5_A, p3_A, nrow = 2, ncol = 1)