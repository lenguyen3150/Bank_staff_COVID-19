library(tidyverse)
library(ggridges)
library(ggpubr)
###############################################################################
#Fig S4-1A: Impact of staff-to-resident ratio on risk of outbreak 
p0_SRRatio <- ggplot(d0_SRRatio, aes(x =Ratio, y = pOb90)) +
  geom_point(size = 2, colour = "maroon2") + 
  geom_linerange(aes(ymin = CI90_Lower, ymax = pOb90 + CI90), width = 0.02, colour = "maroon2") +
  xlab("Staff-to-resident ratio in a care home") + 
  ylab("Probability of outbreak occurrence within 90 days (%)") +
  theme_light()+ theme(text = element_text(size = 12)) +
  ylim(min = 0, max =100) +
  theme(plot.title = element_text(face = "bold")) + 
  ggtitle("A")

###############################################################################
#Fig S4-1B: Impact of resident population size on risk of outbreak 
p0_Size <- ggplot(d0_Size, aes(x =Size, y = pOb90)) +
  geom_point(size = 2, colour = "maroon2") + 
  geom_linerange(aes(ymin = CI90_Lower, ymax = pOb90 + CI90), width = 0.02, colour = "maroon2") +
  xlab("Care home resident population size") + 
  ylab("") +
  theme_light()+ theme(text = element_text(size = 12)) +
  theme(axis.text.y=element_blank(), axis.title.y=element_blank())+
  theme(plot.title = element_text(face = "bold")) + 
  ggtitle("B") + 
  ylim(min = 0, max = 100) 

###############################################################################
#Fig S4-1: 
p0_combine <- ggarrange(p0_SRRatio, p0_Size, ncol = 2, nrow = 1)