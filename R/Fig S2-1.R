library(tidyverse)
library(ggridges)
library(ggpubr)
###############################################################################
#Figure S2-1A: Time series average number of cases among residents in different types of model

d8_mean$ModelN <- factor(d8_mean$Model, c("SD", "Stochastic SD", "ABM"))
p8_mean <- ggplot() + 
  geom_point(data = d8_mean, aes(x = Day, y = Case, colour = ModelN), shape = 1) +
  theme_light() + theme(text = element_text(size = 14)) + 
  ylab("Mean number of infected residents in care home with capacity of 80") +
  xlab("Time (days)") + 
  ylim(min = 0, max = 25) +
  ggtitle("A") + 
  theme(plot.title = element_text(face = "bold")) +
  theme(legend.position = "bottom") +
  labs(colour = "Type of simulation model") 

###############################################################################
#Figure S2-1B: Time series distribution of cases among residents in different types of model

d8$ModelN <- factor(d8$Model, c("Stochastic SD", "ABM"))
p8_dist <-ggplot(d8, aes(x = factor(Day), y = Case, fill = ModelN)) +
  geom_boxplot(outlier.shape =NA) +
  theme_light() + theme(text = element_text(size = 14)) + 
  ylab("Mean number of infected residents in care home with capacity of 80") +
  xlab("Time (days)") + 
  ylim(min = 0, max = 25) +
  theme(axis.text.y = element_blank()) +
  ggtitle("B") + 
  theme(plot.title = element_text(face = "bold")) +
  theme(legend.position = "bottom") +
  labs(fill = "Type of simulation model")   

###############################################################################
#Figure S2-1:
p8 <- ggarrange(p8_mean, p8_dist + rremove("ylab"), nrow = 1)

