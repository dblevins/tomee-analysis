package asm.org.apache.geronimo.javamail.store.imap;
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
public class Rights$RightDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/geronimo/javamail/store/imap/Rights$Right", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/geronimo/javamail/store/imap/Rights$Right", "org/apache/geronimo/javamail/store/imap/Rights", "Right", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "rights", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOOKUP", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READ", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEEP_SEEN", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRITE", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POST", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CREATE", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADMINISTER", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "right", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/Rights$Right", "right", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(C)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "rights", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/javamail/store/imap/Rights$Right");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/imap/Rights$Right");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/imap/Rights$Right", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "rights", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/Rights$Right", "right", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "rights", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "LOOKUP", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "READ", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "KEEP_SEEN", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "WRITE", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "INSERT", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "POST", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "CREATE", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "DELETE", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "getInstance", "(C)Lorg/apache/geronimo/javamail/store/imap/Rights$Right;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/Rights$Right", "ADMINISTER", "Lorg/apache/geronimo/javamail/store/imap/Rights$Right;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
