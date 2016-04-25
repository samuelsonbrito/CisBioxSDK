/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cis.biox.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 *
 * @author Samuelson Brito
 * <b>Email:</b> samuelsonbrito@outlook.com
 */
public class CisBiox extends CisBioxSDK {

    /**
     * @return (int) resposta SDK
     */
    public int iniciar() {
        int iRetorno = this.CIS_SDK_Biometrico_Iniciar();
        return iRetorno;
    }

    /**
     * @return (int) 
     */
    public int finalizar() {
        int iRetorno = this.CIS_SDK_Biometrico_Finalizar();
        return iRetorno;
    }

    /**
     * @param pTemplate = template da digital
     * @return (int)
     */
    public int lerDigital(PointerByReference pTemplate) {
        int iRetorno = this.CIS_SDK_Biometrico_LerDigital(pTemplate);
        return iRetorno;
    }

    /**
     * @param iRetorno
     * @return (Pointer) 
     */
    public Pointer lerDigitalRetornoPonteiro(IntByReference iRetorno) {
        Pointer pDigital;
        pDigital = this.CIS_SDK_Biometrico_LerDigital_RetornoPonteiro(iRetorno);
        return pDigital;
    }

    /**
     * @return (int)
     */
    public int cancelarLeitura() {
        int iRetorno = this.CIS_SDK_Biometrico_CancelarLeitura();
        return iRetorno;
    }

    /**
     * @param pDigital1
     * @param pDigital2
     * @return (int)
     */
    public int compararDigital(PointerByReference pDigital1, PointerByReference pDigital2) {
        int iRetorno = this.CIS_SDK_Biometrico_CompararDigital(pDigital1, pDigital2);
        return iRetorno;
    }

    /**
     * @param iRetorno
     * @param iSize
     * @return (Pointer)
     */
    public Pointer lerDigitalLerWSQ(IntByReference iRetorno, IntByReference iSize) {
        Pointer pImagem;
        pImagem = this.CIS_SDK_Biometrico_LerDigital_LerWSQ(iRetorno, iSize);
        return pImagem;
    }

    /**
     * @return (String) 
     */
    public String versao() {
        Pointer p;
        p = this.CIS_SDK_Versao();
        return  p.getString(0);
    }

}
