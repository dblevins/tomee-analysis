package asm.org.apache.xml.security.stax.impl.processor.output;
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
public class AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", null, "java/io/OutputStream", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "CharacterEventGeneratorOutputStream", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "charactersBuffer", "Ljava/util/Deque;", "Ljava/util/Deque<Lorg/apache/xml/security/stax/ext/stax/XMLSecCharacters;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/OutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayDeque");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayDeque", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "charactersBuffer", "Ljava/util/Deque;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCharactersBuffer", "()Ljava/util/Deque;", "()Ljava/util/Deque<Lorg/apache/xml/security/stax/ext/stax/XMLSecCharacters;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "charactersBuffer", "Ljava/util/Deque;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "charactersBuffer", "Ljava/util/Deque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "createCharacters", "([C)Lorg/apache/xml/security/stax/ext/stax/XMLSecCharacters;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "offer", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([B)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "charactersBuffer", "Ljava/util/Deque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "access$200", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;[BII)[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "createCharacters", "([C)Lorg/apache/xml/security/stax/ext/stax/XMLSecCharacters;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "offer", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "charactersBuffer", "Ljava/util/Deque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "access$200", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor;[BII)[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "createCharacters", "([C)Lorg/apache/xml/security/stax/ext/stax/XMLSecCharacters;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "offer", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
