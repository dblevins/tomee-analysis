package asm.org.bouncycastle.asn1.cryptopro;
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
public class GOST3410NamedParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "objIds", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "params", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "names", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cryptoProA", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cryptoProB", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cryptoProXchA", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "params", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNames", "()Ljava/util/Enumeration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "keys", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByName", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "params", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOID", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "params", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "names", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("127021248288932417465907042777176443525787653508916535812817507265705031260985098497423188333483401180925999995120988934130659205614996724254121049274349357074920312769561451689224110579311248812610229678534638401693520013288995000362260684222750813532307004517341633685004541062586971416883686778842537820383");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("68363196144955700784444165611827252895102170888761442055095051287550314083023");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("100997906755055304772081815535925224869841082572053457874823515875577147990529272777244152852699298796483356699682842027972896052747173175480590485607134746852141928680912561502802222185647539190902656116367847270145019066794290930185446216399730872221732889830323194097355403213400972588322876850946740663962");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters", "<init>", "(ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "cryptoProA", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("139454871199115825601409655107690713107041707059928031797758001454375765357722984094124368522288239833039114681648076688236921220737322672160740747771700911134550432053804647694904686120113087816240740184800477047157336662926249423571248823968542221753660143391485680840520336859458494803187341288580489525163");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("79885141663410976897627118935756323747307951916507639758300472692338873533959");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("42941826148615804143873447737955502392672345968607143066798112994089471231420027060385216699563848719957657284814898909770759462613437669456364882730370838934791080835932647976778601915343474400961034231316672578686920482194932878633360203384797092684342247621055760235016132614780652761028509445403338652341");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters", "<init>", "(ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "cryptoProB", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("142011741597563481196368286022318089743276138395243738762872573441927459393512718973631166078467600360848946623567625795282774719212241929071046134208380636394084512691828894000571524625445295769349356752728956831541775441763139384457191755096847107846595662547942312293338483924514339614727760681880609734239");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("91771529896554605945588149018382750217296858393520724172743325725474374979801");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("133531813272720673433859519948319001217942375967847486899482359599369642528734712461590403327731821410328012529253871914788598993103310567744136196364803064721377826656898686468463277710150809401182608770201615324990468332931294920912776241137878030224355746606283971659376426832674269780880061631528163475887");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters", "<init>", "(ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "cryptoProXchA", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "params", "Ljava/util/Hashtable;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers", "gostR3410_94_CryptoPro_A", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "cryptoProA", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "params", "Ljava/util/Hashtable;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers", "gostR3410_94_CryptoPro_B", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "cryptoProB", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "params", "Ljava/util/Hashtable;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers", "gostR3410_94_CryptoPro_XchA", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "cryptoProXchA", "Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("GostR3410-94-CryptoPro-A");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers", "gostR3410_94_CryptoPro_A", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("GostR3410-94-CryptoPro-B");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers", "gostR3410_94_CryptoPro_B", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410NamedParameters", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("GostR3410-94-CryptoPro-XchA");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers", "gostR3410_94_CryptoPro_XchA", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
