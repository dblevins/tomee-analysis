package asm.org.bouncycastle.asn1.cmc;
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
public class CMCFailInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/cmc/CMCFailInfo", null, "org/bouncycastle/asn1/ASN1Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "badAlg", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "badMessageCheck", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "badRequest", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "badTime", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "badCertId", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unsupportedExt", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "mustArchiveKeys", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "badIdentity", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "popFailed", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "noKeyReuse", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "internalCAError", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "tryLater", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "authDataFail", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "range", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/cmc/CMCFailInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/cmc/CMCFailInfo");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Integer", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unknown object in getInstance(): ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badAlg", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badMessageCheck", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badRequest", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(3L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badTime", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badCertId", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "unsupportedExt", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(6L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "mustArchiveKeys", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(7L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badIdentity", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(8L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popFailed", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(10L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "noKeyReuse", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(11L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "internalCAError", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(12L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "tryLater", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CMCFailInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(13L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CMCFailInfo", "<init>", "(Lorg/bouncycastle/asn1/ASN1Integer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "authDataFail", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badAlg", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badAlg", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badMessageCheck", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badMessageCheck", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badRequest", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badRequest", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badTime", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badTime", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badCertId", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badCertId", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "unsupportedExt", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "unsupportedExt", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "mustArchiveKeys", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "mustArchiveKeys", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badIdentity", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badIdentity", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popFailed", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popFailed", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badCertId", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "badCertId", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "popRequired", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "noKeyReuse", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "noKeyReuse", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "internalCAError", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "internalCAError", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "tryLater", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "tryLater", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "range", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "authDataFail", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CMCFailInfo", "value", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCFailInfo", "authDataFail", "Lorg/bouncycastle/asn1/cmc/CMCFailInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
