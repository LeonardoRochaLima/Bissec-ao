package unifil.br.util.bisseccao.newton;



public class MetodoBisseccao {
    public MetodoBisseccao(){

    }
    public float bissessao(float minIntervalo,float maxIntervalo, float expoente){
        float epslon =(float)Math.pow(10,(expoente * -1));
        boolean flagAproximacao = false;
        float a = 0, b = 0;
        float rr =0;
        int k = 0;
        float ret = 0;
        while (flagAproximacao == false){
            a = media(a,b);
            ret = 0;
            if (k%2==0){
                maxIntervalo = a;
            }else {
                minIntervalo = a;
            }
            //debuf
            System.out.println("minIntervalo = " + minIntervalo + ", maxIntervalo = " + maxIntervalo  );
            float dif = (minIntervalo -maxIntervalo);
            if (dif<0){
                //permitir que os valores nao troquem de sinal
                dif = dif*-1;
            }
            flagAproximacao = proximidade(dif, epslon);
            k++;
        }
        return ret;
    }
    public float media(float a ,float b){
        return (a + b) /2;
    }
    public boolean proximidade(float dif,float parada){
        if (dif < parada){
            return false;
        }
        return true;

    }

}

