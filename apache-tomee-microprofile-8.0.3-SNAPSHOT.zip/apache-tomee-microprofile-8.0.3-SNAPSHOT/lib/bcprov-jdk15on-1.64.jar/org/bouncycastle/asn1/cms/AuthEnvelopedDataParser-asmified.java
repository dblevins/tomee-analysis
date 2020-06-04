package asm.org.bouncycastle.asn1.cms;
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
public class AuthEnvelopedDataParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "version", "Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "originatorInfoCalled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "authEncryptedContentInfoParser", "Lorg/bouncycastle/asn1/cms/EncryptedContentInfoParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/ASN1SequenceParser;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Integer", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "intValueExact", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ParsingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AuthEnvelopedData version number must be 0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ParsingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOriginatorInfo", "()Lorg/bouncycastle/asn1/cms/OriginatorInfo;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "originatorInfoCalled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1TaggedObjectParser");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1TaggedObjectParser");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1TaggedObjectParser", "getTagNo", "()I", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1TaggedObjectParser");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1TaggedObjectParser", "getObjectParser", "(IZ)Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1SequenceParser");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cms/OriginatorInfo", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/cms/OriginatorInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRecipientInfos", "()Lorg/bouncycastle/asn1/ASN1SetParser;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "originatorInfoCalled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "getOriginatorInfo", "()Lorg/bouncycastle/asn1/cms/OriginatorInfo;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1SetParser");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuthEncryptedContentInfo", "()Lorg/bouncycastle/asn1/cms/EncryptedContentInfoParser;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1SequenceParser");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cms/EncryptedContentInfoParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cms/EncryptedContentInfoParser", "<init>", "(Lorg/bouncycastle/asn1/ASN1SequenceParser;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "authEncryptedContentInfoParser", "Lorg/bouncycastle/asn1/cms/EncryptedContentInfoParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "authEncryptedContentInfoParser", "Lorg/bouncycastle/asn1/cms/EncryptedContentInfoParser;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuthAttrs", "()Lorg/bouncycastle/asn1/ASN1SetParser;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1TaggedObjectParser");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1TaggedObjectParser");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1TaggedObjectParser", "getObjectParser", "(IZ)Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1SetParser");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "authEncryptedContentInfoParser", "Lorg/bouncycastle/asn1/cms/EncryptedContentInfoParser;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/cms/EncryptedContentInfoParser", "getContentType", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cms/CMSObjectIdentifiers", "data", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ParsingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("authAttrs must be present with non-data content");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ParsingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMac", "()Lorg/bouncycastle/asn1/ASN1OctetString;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1Encodable", "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1OctetString", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnauthAttrs", "()Lorg/bouncycastle/asn1/ASN1SetParser;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "seq", "Lorg/bouncycastle/asn1/ASN1SequenceParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1SequenceParser", "readObject", "()Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cms/AuthEnvelopedDataParser", "nextObject", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1TaggedObjectParser");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1TaggedObjectParser", "getObjectParser", "(IZ)Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1SetParser");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
