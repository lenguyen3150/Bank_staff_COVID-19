library(tidyverse)
library(ggridges)
###############################################################################
#Figure 3A: Relative risk of outbreak by care home transmission risk

p3_IP <- ggplot(data = d3_IP, 
                mapping = aes(x=IP, y=RR)) +
  geom_hline(yintercept = 1, linetype = "dashed") +
  geom_point(size = 1.75, colour = "blue") +
  geom_linerange(aes(ymin = CI_Lower, ymax = CI_Higher), width = 0.02, 
                 colour = "blue")+
  xlab("Intra-facility transmission risk in each care home") + 
  ylab("Relative risk of outbreaks compared with care homes not using bank/agency staff ") +
  theme_light()+ theme(text = element_text(size = 14)) + 
  xlim(min =0.009, x = 0.035) +
  ggtitle("A") +
  theme(plot.title = element_text(face = "bold")) + 
  ylim(min = 0, max = 62) + coord_flip()

###############################################################################
#Figure 3B: Relative risk of outbreak by staff to resident ratio

p3_SRRatio <- ggplot(d3_SRRatio, aes(x =Ratio, y = RR)) +
  geom_hline(yintercept = 1, linetype = "dashed") +
  geom_point(size = 1.75, colour = "blue") +
  geom_linerange(aes(ymin = CI_Lower, ymax = CI_Higher), width = 0.02, 
                 colour = "blue")+
  xlab("Staff-to-resident ratio in each care home") + 
  ylab("Relative risk of outbreak occurrence compared with care homes not using bank/agency staff") +
  theme_light()+ theme(text = element_text(size = 14)) +
  #theme(axis.text.y=element_blank(), axis.title.y=element_blank())+
  ggtitle("B") +
  theme(plot.title = element_text(face = "bold")) + 
  ylim(min=0, max = 62) + coord_flip()

###############################################################################
#Figure 3C: Relative risk of outbreak by care home size

p3_Size <- ggplot(data = d3_Size, 
                  mapping = aes(x=Size, y=RR)) +
  geom_hline(yintercept = 1, linetype = "dashed") +
  geom_point(size = 1.75, colour = "blue") +
  geom_linerange(aes(ymin = CI_Lower, ymax = CI_Higher), width = 0.02, 
                 colour = "blue")+
  xlab("Care home size") + 
  ylab("Relative risk of outbreaks compared with care homes not using bank/agency staff ") +
  theme_light()+ theme(text = element_text(size = 12)) + 
  ggtitle("C") + theme(text = element_text(size = 14)) +
  theme(plot.title = element_text(face = "bold")) +
  ylim(min=0, max = 62) + coord_flip()

###############################################################################
#Combine Figure 3A, 3B & 3C

p3_combine <- ggarrange(p3_IP + rremove("xlab"), 
                        p3_SRRatio + rremove("xlab"), 
                        p3_Size + rremove("xlab"), 
                        ncol = 3, nrow = 1)

p3_combine<- annotate_figure(p3_combine, 
                             bottom = text_grob("Relative risk of outbreak occurrence in individual care homes",
                                                size =14))
