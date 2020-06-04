package asm.org.opensaml.saml.common.xml;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class SAMLConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/saml/common/xml/SAMLConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POST_METHOD", "Ljava/lang/String;", null, "POST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GET_METHOD", "Ljava/lang/String;", null, "GET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_DIR", "Ljava/lang/String;", null, "/schema/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/xml.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XSD_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/XMLSchema.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLSIG_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/xmldsig-core-schema.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLSIG11_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/xmldsig11-schema.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLENC_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/xenc-schema.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLENC11_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/xenc11-schema.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP11ENV_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/soap-envelope.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP11ENV_NS", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/soap/envelope/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP11ENV_PREFIX", "Ljava/lang/String;", null, "SOAP-ENV");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PAOS_NS", "Ljava/lang/String;", null, "urn:liberty:paos:2003-08");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PAOS_PREFIX", "Ljava/lang/String;", null, "paos");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML10_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/oasis-sstc-saml-schema-assertion-1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML11_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/oasis-sstc-saml-schema-assertion-1.1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:assertion");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML10P_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/oasis-sstc-saml-schema-protocol-1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML11P_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/oasis-sstc-saml-schema-protocol-1.1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML10P_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:protocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML11P_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:protocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1P_PREFIX", "Ljava/lang/String;", null, "saml1p");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1_PREFIX", "Ljava/lang/String;", null, "saml1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1MD_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:profiles:v1metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1MD_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml1x-metadata.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1MD_PREFIX", "Ljava/lang/String;", null, "saml1md");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1_ARTIFACT_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:profiles:artifact-01");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1_POST_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:profiles:browser-post");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML1_SOAP11_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:bindings:SOAP-binding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-assertion-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:assertion");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20_PREFIX", "Ljava/lang/String;", null, "saml2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20P_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-protocol-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20P_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:protocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20P_PREFIX", "Ljava/lang/String;", null, "saml2p");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20PTHRPTY_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-protocol-ext-thirdparty.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20PTHRPTY_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:protocol:ext:third-party");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20PTHRPTY_PREFIX", "Ljava/lang/String;", null, "thrpty");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20PASLO_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-async-slo-v1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20PASLO_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:protocol:ext:async-slo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20PASLO_PREFIX", "Ljava/lang/String;", null, "aslo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MD_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-metadata-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MD_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDQUERY_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:metadata:ext:query");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDQUERY_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-metadata-ext-query.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDQUERY_PREFIX", "Ljava/lang/String;", null, "query");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MD_PREFIX", "Ljava/lang/String;", null, "md");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20AC_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-authn-context-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20AC_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20AC_PREFIX", "Ljava/lang/String;", null, "ac");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20ECP_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-ecp-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20ECP_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20ECP_PREFIX", "Ljava/lang/String;", null, "ecp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20DEL_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-delegation.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20DEL_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:conditions:delegation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20DEL_PREFIX", "Ljava/lang/String;", null, "del");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDATTR_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-metadata-attr.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDATTR_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:metadata:attribute");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDATTR_PREFIX", "Ljava/lang/String;", null, "mdattr");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDUI_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-metadata-ui-v1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDUI_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:metadata:ui");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDUI_PREFIX", "Ljava/lang/String;", null, "mdui");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDRI_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:profiles:SSO:request-init");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDRI_PREFIX", "Ljava/lang/String;", null, "init");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDRPI_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-metadata-rpi-v1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDRPI_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:metadata:rpi");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20MDRPI_PREFIX", "Ljava/lang/String;", null, "mdrpi");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20CB_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-channel-binding-ext-v1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20CB_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:protocol:ext:channel-binding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20CB_PREFIX", "Ljava/lang/String;", null, "cb");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20DCE_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-dce-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20DCE_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:profiles:attribute:DCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20DCE_PREFIX", "Ljava/lang/String;", null, "DCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20X500_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-x500-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20X500_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:profiles:attribute:X500");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20X500_PREFIX", "Ljava/lang/String;", null, "x500");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20XACML_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/saml-schema-xacml-2.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20XACML_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:profiles:attribute:XACML");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20XACML_PREFIX", "Ljava/lang/String;", null, "xacmlprof");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_IDP_DISCO_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-idp-discovery.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_IDP_DISCO_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:profiles:SSO:idp-discovery-protocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_IDP_DISCO_PREFIX", "Ljava/lang/String;", null, "idpdisco");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAMLEC_GSS_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/ietf-kitten-sasl-saml-ec.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAMLEC_GSS_NS", "Ljava/lang/String;", null, "urn:ietf:params:xml:ns:samlec");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAMLEC_GSS_PREFIX", "Ljava/lang/String;", null, "samlec");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_ARTIFACT_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Artifact");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_POST_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_POST_SIMPLE_SIGN_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST-SimpleSign");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_REDIRECT_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_SOAP11_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:SOAP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_PAOS_BINDING_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:PAOS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20ALG_SCHEMA_LOCATION", "Ljava/lang/String;", null, "/schema/sstc-saml-metadata-algsupport-v1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20ALG_NS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:metadata:algsupport");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML20ALG_PREFIX", "Ljava/lang/String;", null, "alg");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML2_BINDING_URL_ENCODING_DEFLATE_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:bindings:URL-Encoding:DEFLATE");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
