package asm.org.apache.myfaces.shared.trace;
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
public class TracingIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/shared/trace/TracingIterator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Iterator<TE;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/myfaces/shared/trace/TracingIterator$3", null, null, 0);

classWriter.visitInnerClass("org/apache/myfaces/shared/trace/TracingIterator$2", null, null, 0);

classWriter.visitInnerClass("org/apache/myfaces/shared/trace/TracingIterator$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_iterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Iterator;)V", "(Ljava/util/Iterator<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_iterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/trace/TracingSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/trace/TracingSupport", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljava/util/Iterator;)Lorg/apache/myfaces/shared/trace/TracingIterator;", "<E:Ljava/lang/Object;>(Ljava/util/Iterator<TE;>;)Lorg/apache/myfaces/shared/trace/TracingIterator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/trace/TracingIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/trace/TracingIterator", "<init>", "(Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_iterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitLdcInsn("hasNext");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/trace/TracingIterator$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/trace/TracingIterator$1", "<init>", "(Lorg/apache/myfaces/shared/trace/TracingIterator;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "trace", "(Ljava/lang/String;Lorg/apache/myfaces/shared/trace/Closure;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitLdcInsn("next");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/trace/TracingIterator$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/trace/TracingIterator$2", "<init>", "(Lorg/apache/myfaces/shared/trace/TracingIterator;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "trace", "(Ljava/lang/String;Lorg/apache/myfaces/shared/trace/Closure;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/trace/TracingIterator$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/trace/TracingIterator$3", "<init>", "(Lorg/apache/myfaces/shared/trace/TracingIterator;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "trace", "(Ljava/lang/String;Lorg/apache/myfaces/shared/trace/Closure;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLevel", "()Ljava/util/logging/Level;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "getLevel", "()Ljava/util/logging/Level;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogger", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSourceClass", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "getSourceClass", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLevel", "(Ljava/util/logging/Level;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "setLevel", "(Ljava/util/logging/Level;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLogger", "(Ljava/util/logging/Logger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "setLogger", "(Ljava/util/logging/Logger;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSourceClass", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_tracer", "Lorg/apache/myfaces/shared/trace/TracingSupport;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/trace/TracingSupport", "setSourceClass", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/myfaces/shared/trace/TracingIterator;)Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/trace/TracingIterator", "_iterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
