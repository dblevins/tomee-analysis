package asm.org.apache.activemq.store.kahadb.data;
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
public class KahaRemoveDestinationCommandDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase<Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;>;Lorg/apache/activemq/store/kahadb/JournalCommand<Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;>;", "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", new String[] { "org/apache/activemq/store/kahadb/JournalCommand" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "missingFields", "()Ljava/util/ArrayList;", "()Ljava/util/ArrayList<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/activemq/protobuf/UninitializedMessageException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", "missingFields", "()Ljava/util/ArrayList;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("destination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/ArrayList"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "assertInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/activemq/protobuf/UninitializedMessageException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/protobuf/UninitializedMessageException", "getMissingFields", "()Ljava/util/List;", false);
methodVisitor.visitLdcInsn("destination.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "prefix", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "clearDestination", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "()Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeFrom", "(Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mergeFrom", "(Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "mergeFrom", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "clone", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "setDestination", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serializedSizeUnframed", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "memoizedSerializedSize", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "memoizedSerializedSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "computeMessageSize", "(ILorg/apache/activemq/protobuf/BaseMessage;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "memoizedSerializedSize", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mergeUnframed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/protobuf/CodedInputStream", "readTag", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(ICONST_4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitLookupSwitchInsn(label4, new int[] { 0, 10 }, new Label[] { label2, label3 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "mergeFramed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestination");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "mergeFramed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "setDestination", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeUnframed", "(Lorg/apache/activemq/protobuf/CodedOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "writeMessage", "(Lorg/apache/activemq/protobuf/CodedOutputStream;ILorg/apache/activemq/protobuf/BaseMessage;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseUnframed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeUnframed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseUnframed", "(Lorg/apache/activemq/protobuf/Buffer;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeUnframed", "(Lorg/apache/activemq/protobuf/Buffer;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseUnframed", "([B)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeUnframed", "([B)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseUnframed", "(Ljava/io/InputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeUnframed", "(Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseFramed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeFramed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseFramed", "(Lorg/apache/activemq/protobuf/Buffer;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeFramed", "(Lorg/apache/activemq/protobuf/Buffer;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseFramed", "([B)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeFramed", "([B)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseFramed", "(Ljava/io/InputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", null, new String[] { "org/apache/activemq/protobuf/InvalidProtocolBufferException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeFramed", "(Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "checktInitialized", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "toString", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("destination {\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "toString", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("}\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/activemq/store/kahadb/Visitor;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/Visitor", "visit", "(Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "type", "()Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_DESTINATION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;"));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "equals", "(Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
methodVisitor.visitInsn(IXOR);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "equals", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(new Integer(302570256));
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "hasDestination", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(238021614));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "hashCode", "()I", false);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clearDestination", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", "clearDestination", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", "getDestination", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "hasDestination", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommandBase", "hasDestination", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "mergeFrom", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeFrom", "(Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "clone", "()Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "mergeUnframed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "mergeUnframed", "(Lorg/apache/activemq/protobuf/CodedInputStream;)Lorg/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
