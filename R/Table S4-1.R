library(lhs)
library(triangle)
library(epiR)
###############################################################################
#LHS
set.seed(1111)
A <- randomLHS(10000, 16)
B <- matrix(nrow = nrow(A), ncol = ncol(A))
B[,1] <- qtriangle(A[,1], a = 0.00005, b = 0.002, c = 0.0005)
B[,2] <- qtriangle(A[,2], a = 0.291, b = 0.434, c = 0.359)
B[,3] <- qtriangle(A[,3], a = 0.00003, b =0.00315, c = 0.0007)
B[,4] <- qtriangle(A[,4], a = 1, b = 5, c = 4.1)
B[,5] <- qtriangle(A[,5], a = 5, b = 15, c = 9.6)
B[,6] <- qtriangle(A[,6], a = 5, b = 15, c = 7.6)
B[,7] <- qtriangle(A[,7], a = 0.14, b = 0.377, c = 0.24)
B[,8] <- qtriangle(A[,8], a = 0.001, b = 0.005, c = 0.004)
B[,9] <- qtriangle(A[,9], a = 0.5, b = 0.9, c = 0.7)
B[,10] <- qtriangle(A[,10], a = 0.4, b = 0.8, c = 0.6)
B[,11] <- qtriangle(A[,11], a = 0.001, b = 0.05, c = 0.02)
B[,12] <- qunif(A[,12], 1, 3)
B[,13] <- qlnorm(A[,13], 2.249, 0.246)
B[,14] <- qtriangle(A[,14], a = 0.2, b = 0.9, c = 0.75)
B[,15] <- qtriangle(A[,15], a = 0.7, b = 0.98, c = 0.9)
B[,16] <- qtriangle(A[,16], a = 1, b = 4, c = 2)

###############################################################################
#PRCC
epi.prcc(d_SA1, sided.test = 2)
epi.prcc(d_SA2, sided.test = 2)
