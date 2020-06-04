package asm.com.fasterxml.jackson.core.util;
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
public class ThreadLocalBufferManager$ThreadLocalBufferManagerHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "com/fasterxml/jackson/core/util/ThreadLocalBufferManager$ThreadLocalBufferManagerHolder", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/core/util/ThreadLocalBufferManager$ThreadLocalBufferManagerHolder", "com/fasterxml/jackson/core/util/ThreadLocalBufferManager", "ThreadLocalBufferManagerHolder", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "manager", "Lcom/fasterxml/jackson/core/util/ThreadLocalBufferManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/util/ThreadLocalBufferManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/ThreadLocalBufferManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/util/ThreadLocalBufferManager$ThreadLocalBufferManagerHolder", "manager", "Lcom/fasterxml/jackson/core/util/ThreadLocalBufferManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
