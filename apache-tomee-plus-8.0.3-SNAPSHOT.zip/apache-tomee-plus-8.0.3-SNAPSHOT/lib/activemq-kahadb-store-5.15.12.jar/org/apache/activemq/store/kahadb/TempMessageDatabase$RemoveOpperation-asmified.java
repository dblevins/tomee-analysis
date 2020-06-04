package asm.org.apache.activemq.store.kahadb;
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
public class TempMessageDatabase$RemoveOpperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", null, "org/apache/activemq/store/kahadb/TempMessageDatabase$Operation", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", "org/apache/activemq/store/kahadb/TempMessageDatabase", "RemoveOpperation", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$Operation", "org/apache/activemq/store/kahadb/TempMessageDatabase", "Operation", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "command", "Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/TempMessageDatabase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/TempMessageDatabase;Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", "this$0", "Lorg/apache/activemq/store/kahadb/TempMessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/TempMessageDatabase$Operation", "<init>", "(Lorg/apache/activemq/store/kahadb/TempMessageDatabase;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", "command", "Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", "this$0", "Lorg/apache/activemq/store/kahadb/TempMessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", "command", "Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/TempMessageDatabase", "access$100", "(Lorg/apache/activemq/store/kahadb/TempMessageDatabase;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCommand", "()Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$RemoveOpperation", "command", "Lorg/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
