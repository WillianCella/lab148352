
package br.cella.wsclient.produto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.cella.wsclient.produto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Buscar_QNAME = new QName("http://webservices.cella/", "buscar");
    private final static QName _BuscarResponse_QNAME = new QName("http://webservices.cella/", "buscarResponse");
    private final static QName _Deletar_QNAME = new QName("http://webservices.cella/", "deletar");
    private final static QName _DeletarResponse_QNAME = new QName("http://webservices.cella/", "deletarResponse");
    private final static QName _Salvar_QNAME = new QName("http://webservices.cella/", "salvar");
    private final static QName _AtualziarResponse_QNAME = new QName("http://webservices.cella/", "atualziarResponse");
    private final static QName _Atualziar_QNAME = new QName("http://webservices.cella/", "atualziar");
    private final static QName _SalvarResponse_QNAME = new QName("http://webservices.cella/", "salvarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.cella.wsclient.produto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Deletar }
     * 
     */
    public Deletar createDeletar() {
        return new Deletar();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link AtualziarResponse }
     * 
     */
    public AtualziarResponse createAtualziarResponse() {
        return new AtualziarResponse();
    }

    /**
     * Create an instance of {@link Atualziar }
     * 
     */
    public Atualziar createAtualziar() {
        return new Atualziar();
    }

    /**
     * Create an instance of {@link DeletarResponse }
     * 
     */
    public DeletarResponse createDeletarResponse() {
        return new DeletarResponse();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "deletar")
    public JAXBElement<Deletar> createDeletar(Deletar value) {
        return new JAXBElement<Deletar>(_Deletar_QNAME, Deletar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "deletarResponse")
    public JAXBElement<DeletarResponse> createDeletarResponse(DeletarResponse value) {
        return new JAXBElement<DeletarResponse>(_DeletarResponse_QNAME, DeletarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualziarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "atualziarResponse")
    public JAXBElement<AtualziarResponse> createAtualziarResponse(AtualziarResponse value) {
        return new JAXBElement<AtualziarResponse>(_AtualziarResponse_QNAME, AtualziarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualziar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "atualziar")
    public JAXBElement<Atualziar> createAtualziar(Atualziar value) {
        return new JAXBElement<Atualziar>(_Atualziar_QNAME, Atualziar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.cella/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

}
