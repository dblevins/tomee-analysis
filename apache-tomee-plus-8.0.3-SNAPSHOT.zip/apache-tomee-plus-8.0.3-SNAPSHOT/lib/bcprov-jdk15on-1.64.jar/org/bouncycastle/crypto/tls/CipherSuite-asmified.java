package asm.org.bouncycastle.crypto.tls;
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
public class CipherSuiteDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/crypto/tls/CipherSuite", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_NULL_WITH_NULL_NULL", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_NULL_MD5", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_NULL_SHA", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_RC4_128_MD5", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_RC4_128_SHA", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5", "I", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_IDEA_CBC_SHA", "I", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "I", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_DES_CBC_SHA", "I", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_EXPORT_WITH_DES40_CBC_SHA", "I", null, new Integer(11));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_DES_CBC_SHA", "I", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(13));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_EXPORT_WITH_DES40_CBC_SHA", "I", null, new Integer(14));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_DES_CBC_SHA", "I", null, new Integer(15));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "I", null, new Integer(17));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_DES_CBC_SHA", "I", null, new Integer(18));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(19));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "I", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_DES_CBC_SHA", "I", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "I", null, new Integer(23));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_RC4_128_MD5", "I", null, new Integer(24));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "I", null, new Integer(25));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_DES_CBC_SHA", "I", null, new Integer(26));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(27));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(47));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_AES_128_CBC_SHA", "I", null, new Integer(48));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "I", null, new Integer(50));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(51));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_AES_128_CBC_SHA", "I", null, new Integer(52));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(53));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_AES_256_CBC_SHA", "I", null, new Integer(54));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(55));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "I", null, new Integer(56));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(57));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_AES_256_CBC_SHA", "I", null, new Integer(58));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "I", null, new Integer(65));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA", "I", null, new Integer(66));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_CAMELLIA_128_CBC_SHA", "I", null, new Integer(67));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "I", null, new Integer(68));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "I", null, new Integer(69));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA", "I", null, new Integer(70));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "I", null, new Integer(132));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA", "I", null, new Integer(133));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA", "I", null, new Integer(134));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "I", null, new Integer(135));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "I", null, new Integer(136));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA", "I", null, new Integer(137));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(186));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(187));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(188));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(189));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(190));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(191));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA256", "I", null, new Integer(192));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256", "I", null, new Integer(193));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256", "I", null, new Integer(194));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256", "I", null, new Integer(195));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256", "I", null, new Integer(196));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256", "I", null, new Integer(197));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_SEED_CBC_SHA", "I", null, new Integer(150));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_SEED_CBC_SHA", "I", null, new Integer(151));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_SEED_CBC_SHA", "I", null, new Integer(152));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_SEED_CBC_SHA", "I", null, new Integer(153));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_SEED_CBC_SHA", "I", null, new Integer(154));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_SEED_CBC_SHA", "I", null, new Integer(155));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_RC4_128_SHA", "I", null, new Integer(138));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(139));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_128_CBC_SHA", "I", null, new Integer(140));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_256_CBC_SHA", "I", null, new Integer(141));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_RC4_128_SHA", "I", null, new Integer(142));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(143));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_128_CBC_SHA", "I", null, new Integer(144));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_256_CBC_SHA", "I", null, new Integer(145));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_RC4_128_SHA", "I", null, new Integer(146));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(147));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_AES_128_CBC_SHA", "I", null, new Integer(148));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_AES_256_CBC_SHA", "I", null, new Integer(149));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_NULL_SHA", "I", null, new Integer(49153));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "I", null, new Integer(49154));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49155));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49156));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(49157));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "I", null, new Integer(49158));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "I", null, new Integer(49159));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49160));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49161));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(49162));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_NULL_SHA", "I", null, new Integer(49163));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_RC4_128_SHA", "I", null, new Integer(49164));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49165));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49166));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(49167));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_NULL_SHA", "I", null, new Integer(49168));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "I", null, new Integer(49169));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49170));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49171));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(49172));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_anon_WITH_NULL_SHA", "I", null, new Integer(49173));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_anon_WITH_RC4_128_SHA", "I", null, new Integer(49174));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49175));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "I", null, new Integer(49176));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "I", null, new Integer(49177));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_NULL_SHA", "I", null, new Integer(44));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_NULL_SHA", "I", null, new Integer(45));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_NULL_SHA", "I", null, new Integer(46));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49178));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49179));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49180));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49181));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA", "I", null, new Integer(49182));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA", "I", null, new Integer(49183));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_WITH_AES_256_CBC_SHA", "I", null, new Integer(49184));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA", "I", null, new Integer(49185));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA", "I", null, new Integer(49186));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_NULL_SHA256", "I", null, new Integer(59));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(60));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_256_CBC_SHA256", "I", null, new Integer(61));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_AES_128_CBC_SHA256", "I", null, new Integer(62));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(63));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(103));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_AES_256_CBC_SHA256", "I", null, new Integer(104));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_AES_256_CBC_SHA256", "I", null, new Integer(105));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "I", null, new Integer(106));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "I", null, new Integer(107));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "I", null, new Integer(108));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "I", null, new Integer(109));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(156));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(157));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(158));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(159));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(160));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(161));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "I", null, new Integer(162));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "I", null, new Integer(163));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_AES_128_GCM_SHA256", "I", null, new Integer(164));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_AES_256_GCM_SHA384", "I", null, new Integer(165));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "I", null, new Integer(166));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "I", null, new Integer(167));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(49187));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "I", null, new Integer(49188));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(49189));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "I", null, new Integer(49190));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(49191));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "I", null, new Integer(49192));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "I", null, new Integer(49193));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "I", null, new Integer(49194));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(49195));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(49196));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(49197));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(49198));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(49199));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(49200));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "I", null, new Integer(49201));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "I", null, new Integer(49202));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_128_GCM_SHA256", "I", null, new Integer(168));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_256_GCM_SHA384", "I", null, new Integer(169));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_128_GCM_SHA256", "I", null, new Integer(170));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_256_GCM_SHA384", "I", null, new Integer(171));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_AES_128_GCM_SHA256", "I", null, new Integer(172));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_AES_256_GCM_SHA384", "I", null, new Integer(173));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_128_CBC_SHA256", "I", null, new Integer(174));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_256_CBC_SHA384", "I", null, new Integer(175));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_NULL_SHA256", "I", null, new Integer(176));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_NULL_SHA384", "I", null, new Integer(177));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_128_CBC_SHA256", "I", null, new Integer(178));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_256_CBC_SHA384", "I", null, new Integer(179));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_NULL_SHA256", "I", null, new Integer(180));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_NULL_SHA384", "I", null, new Integer(181));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_AES_128_CBC_SHA256", "I", null, new Integer(182));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_AES_256_CBC_SHA384", "I", null, new Integer(183));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_NULL_SHA256", "I", null, new Integer(184));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_NULL_SHA384", "I", null, new Integer(185));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_RC4_128_SHA", "I", null, new Integer(49203));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA", "I", null, new Integer(49204));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "I", null, new Integer(49205));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "I", null, new Integer(49206));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256", "I", null, new Integer(49207));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384", "I", null, new Integer(49208));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_NULL_SHA", "I", null, new Integer(49209));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_NULL_SHA256", "I", null, new Integer(49210));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_NULL_SHA384", "I", null, new Integer(49211));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "I", null, new Integer(255));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49266));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49267));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49268));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49269));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49270));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49271));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49272));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49273));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49274));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49275));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49276));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49277));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49278));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49279));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49280));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49281));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49282));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49283));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49284));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49285));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49286));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49287));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49288));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49289));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49290));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49291));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49292));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49293));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49294));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49295));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49296));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49297));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256", "I", null, new Integer(49298));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384", "I", null, new Integer(49299));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49300));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49301));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49302));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49303));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49304));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49305));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256", "I", null, new Integer(49306));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384", "I", null, new Integer(49307));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_128_CCM", "I", null, new Integer(49308));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_256_CCM", "I", null, new Integer(49309));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_128_CCM", "I", null, new Integer(49310));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_256_CCM", "I", null, new Integer(49311));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_128_CCM_8", "I", null, new Integer(49312));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_RSA_WITH_AES_256_CCM_8", "I", null, new Integer(49313));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_128_CCM_8", "I", null, new Integer(49314));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_RSA_WITH_AES_256_CCM_8", "I", null, new Integer(49315));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_128_CCM", "I", null, new Integer(49316));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_256_CCM", "I", null, new Integer(49317));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_128_CCM", "I", null, new Integer(49318));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_DHE_PSK_WITH_AES_256_CCM", "I", null, new Integer(49319));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_128_CCM_8", "I", null, new Integer(49320));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_WITH_AES_256_CCM_8", "I", null, new Integer(49321));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_DHE_WITH_AES_128_CCM_8", "I", null, new Integer(49322));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_PSK_DHE_WITH_AES_256_CCM_8", "I", null, new Integer(49323));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM", "I", null, new Integer(49324));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM", "I", null, new Integer(49325));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8", "I", null, new Integer(49326));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8", "I", null, new Integer(49327));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_FALLBACK_SCSV", "I", null, new Integer(22016));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52392));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52393));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52394));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_PSK_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52395));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52396));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52397));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256", "I", null, new Integer(52398));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB", "I", null, new Integer(65280));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_DHE_RSA_WITH_AES_256_OCB", "I", null, new Integer(65281));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_RSA_WITH_AES_128_OCB", "I", null, new Integer(65282));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB", "I", null, new Integer(65283));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB", "I", null, new Integer(65284));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB", "I", null, new Integer(65285));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_PSK_WITH_AES_128_OCB", "I", null, new Integer(65296));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_PSK_WITH_AES_256_OCB", "I", null, new Integer(65297));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB", "I", null, new Integer(65298));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB", "I", null, new Integer(65299));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB", "I", null, new Integer(65300));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB", "I", null, new Integer(65301));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isSCSV", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitLookupSwitchInsn(label1, new int[] { 255, 22016 }, new Label[] { label0, label0 });
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
