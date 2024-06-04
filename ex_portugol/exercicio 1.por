programa {
  funcao inicio() {
    inteiro vetor[]={2,5,1,3,4,9,7,8,10,6},vetorOrd[10],maior=0
    //criando uma var de controle
    para(inteiro j=0;j<10;j++)
      se(vetor[j]>maior)
        maior = vetor[j]
    inteiro maiorC = maior + 1
    //criando um vetor Ordenado
    para(inteiro x=0;x<10;x++){
      inteiro maior=0
      para (inteiro l=0;l<10;l++){
        se(vetor[l]>maior e vetor[l]<maiorC)
         maior = vetor[l]
      }
      vetorOrd[x] = maior
    //alterando o controle
      maiorC= maior
    }
    escreva(vetorOrd)
  }
}


