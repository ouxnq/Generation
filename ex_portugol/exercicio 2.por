programa {
  funcao inicio() {
    inteiro vetor[]={2,5,1,3,4,9,7,8,10,6}
    
    escreva("Elementos nos índices ímpares: ")
    
    para(inteiro i=0;i<10;i++) {
        se(i%2!=0)
          escreva(vetor[i], ", ")
    }
    escreva("\nElementos pares: ")
    para(inteiro j=0;j<10;j++){
        se(vetor[j]%2==0)
          escreva(vetor[j],", ")
    }
    escreva("\nSoma: ")
    inteiro soma = 0
    para (inteiro k=0;k<10;k++){
      soma+=vetor[k]
    }
    escreva(soma)
    escreva("\nMédia: ")
    soma = 0
    para (inteiro k=0;k<10;k++){
      soma+=vetor[k]
    }
    soma = soma/10
    escreva(soma)
 }
}
