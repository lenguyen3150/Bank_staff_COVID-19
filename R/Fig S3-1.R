library(tidyverse)
###############################################################################
#Figure S3-1: Relative risk of infection for bank staff to permanent staff
d = subset(d3, Network == "B" & IP == "Const" & fShared != 0 &
             (Compliance == 0 | Compliance == 0.4 | Compliance == 0.8))

p3_RR_Staff <- ggplot(d, aes(x = RRs90, y = factor(fShared))) +
  geom_vline(xintercept = 1, colour ="red", linetype = "dashed") + 
  geom_boxplot(outlier.shape = NA, alpha = 0.2, width = 0.3, colour = "BLACK") + 
  xlab("RR of infection for bank/agency staff compared with permanent staff") +
  ylab("Proportion of bank/agency staff") + 
  theme_light() +
  theme(text = element_text(size = 14)) +
  facet_grid(. ~ Compliance, labeller = label_both) +
  theme(strip.text = element_text(color = "black")) 
