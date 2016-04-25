package br.com.cis.biox.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 *
 * @author Samuelson Brito
 */
abstract class CisBioxSDK implements ICisBioxSDK {

    private final ICisBioxSDK sdk = ICisBioxSDK.INSTANCE;

    @Override
    public int CIS_SDK_Biometrico_Iniciar() {
        int iRetorno = sdk.CIS_SDK_Biometrico_Iniciar();
        return iRetorno;
    }

    @Override
    public int CIS_SDK_Biometrico_Finalizar() {
        int iRetorno = sdk.CIS_SDK_Biometrico_Finalizar();
        return iRetorno;
    }

    @Override
    public int CIS_SDK_Biometrico_LerDigital(PointerByReference pTemplate) {
        int iRetorno = sdk.CIS_SDK_Biometrico_LerDigital(pTemplate);
        return iRetorno;
    }

    @Override
    public Pointer CIS_SDK_Biometrico_LerDigital_RetornoPonteiro(IntByReference iRetorno) {
        Pointer pDigital;
        pDigital = sdk.CIS_SDK_Biometrico_LerDigital_RetornoPonteiro(iRetorno);
        return pDigital;
    }

    @Override
    public int CIS_SDK_Biometrico_CancelarLeitura() {
        int iRetorno = sdk.CIS_SDK_Biometrico_CancelarLeitura();
        return iRetorno;
    }

    @Override
    public int CIS_SDK_Biometrico_CompararDigital(PointerByReference pAmostra1, PointerByReference pAmostra2) {
        int iRetorno = sdk.CIS_SDK_Biometrico_CompararDigital(pAmostra1, pAmostra2);
        return iRetorno;
    }

    @Override
    public Pointer CIS_SDK_Biometrico_LerDigital_LerWSQ(IntByReference iRetorno, IntByReference iSize) {
        Pointer pImagem;
        pImagem = sdk.CIS_SDK_Biometrico_LerDigital_LerWSQ(iRetorno, iSize);
        return pImagem;
    }

    @Override
    public Pointer CIS_SDK_Versao() {
        Pointer p;
        p = sdk.CIS_SDK_Versao();
        return p;
    }

}
