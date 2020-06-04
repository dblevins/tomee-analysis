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
public class MessageDatabase$AddOperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Operation<Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;>;", "org/apache/activemq/store/kahadb/MessageDatabase$Operation", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$IndexAware", "org/apache/activemq/store/kahadb/MessageDatabase", "IndexAware", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "org/apache/activemq/store/kahadb/MessageDatabase", "AddOperation", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$Operation", "org/apache/activemq/store/kahadb/MessageDatabase", "Operation", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "runWithIndexLock", "Lorg/apache/activemq/store/kahadb/MessageDatabase$IndexAware;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase;Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;Lorg/apache/activemq/store/kahadb/disk/journal/Location;Lorg/apache/activemq/store/kahadb/MessageDatabase$IndexAware;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase$Operation", "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase;Lorg/apache/activemq/store/kahadb/JournalCommand;Lorg/apache/activemq/store/kahadb/disk/journal/Location;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "runWithIndexLock", "Lorg/apache/activemq/store/kahadb/MessageDatabase$IndexAware;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "command", "Lorg/apache/activemq/store/kahadb/JournalCommand;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "location", "Lorg/apache/activemq/store/kahadb/disk/journal/Location;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase", "updateIndex", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;Lorg/apache/activemq/store/kahadb/disk/journal/Location;)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "runWithIndexLock", "Lorg/apache/activemq/store/kahadb/MessageDatabase$IndexAware;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$AddOperation", "runWithIndexLock", "Lorg/apache/activemq/store/kahadb/MessageDatabase$IndexAware;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/kahadb/MessageDatabase$IndexAware", "sequenceAssignedWithIndexLocked", "(J)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
