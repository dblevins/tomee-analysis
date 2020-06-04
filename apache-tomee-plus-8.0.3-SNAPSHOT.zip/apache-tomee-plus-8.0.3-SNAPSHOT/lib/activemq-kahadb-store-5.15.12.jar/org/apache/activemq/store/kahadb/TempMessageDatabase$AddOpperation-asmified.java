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
public class TempMessageDatabase$AddOpperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", null, "org/apache/activemq/store/kahadb/TempMessageDatabase$Operation", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "org/apache/activemq/store/kahadb/TempMessageDatabase", "AddOpperation", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$Operation", "org/apache/activemq/store/kahadb/TempMessageDatabase", "Operation", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "command", "Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "data", "Lorg/apache/activemq/util/ByteSequence;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/TempMessageDatabase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/TempMessageDatabase;Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;Lorg/apache/activemq/util/ByteSequence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "this$0", "Lorg/apache/activemq/store/kahadb/TempMessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/TempMessageDatabase$Operation", "<init>", "(Lorg/apache/activemq/store/kahadb/TempMessageDatabase;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "command", "Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "data", "Lorg/apache/activemq/util/ByteSequence;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "this$0", "Lorg/apache/activemq/store/kahadb/TempMessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "command", "Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "data", "Lorg/apache/activemq/util/ByteSequence;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/TempMessageDatabase", "access$000", "(Lorg/apache/activemq/store/kahadb/TempMessageDatabase;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;Lorg/apache/activemq/util/ByteSequence;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCommand", "()Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$AddOpperation", "command", "Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
