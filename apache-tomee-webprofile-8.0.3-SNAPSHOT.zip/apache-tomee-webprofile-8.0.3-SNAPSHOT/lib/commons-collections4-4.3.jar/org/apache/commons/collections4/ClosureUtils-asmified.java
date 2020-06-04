package asm.org.apache.commons.collections4;
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
public class ClosureUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/ClosureUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "exceptionClosure", "()Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ExceptionClosure", "exceptionClosure", "()Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nopClosure", "()Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NOPClosure", "nopClosure", "()Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "asClosure", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Transformer<-TE;*>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/TransformerClosure", "transformerClosure", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "forClosure", "(ILorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(ILorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ForClosure", "forClosure", "(ILorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "whileClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/WhileClosure", "whileClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;Z)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "doWhileClosure", "(Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Closure<-TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/WhileClosure", "whileClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;Z)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerClosure", "(Ljava/lang/String;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InvokerTransformer", "invokerTransformer", "(Ljava/lang/String;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/ClosureUtils", "asClosure", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerClosure", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InvokerTransformer", "invokerTransformer", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/ClosureUtils", "asClosure", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "chainedClosure", "([Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ChainedClosure", "chainedClosure", "([Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "chainedClosure", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Ljava/util/Collection<+Lorg/apache/commons/collections4/Closure<-TE;>;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ChainedClosure", "chainedClosure", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "ifClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/IfClosure", "ifClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "ifClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/IfClosure", "ifClosure", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchClosure", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TE;>;[Lorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchClosure", "switchClosure", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchClosure", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TE;>;[Lorg/apache/commons/collections4/Closure<-TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchClosure", "switchClosure", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchClosure", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Ljava/util/Map<Lorg/apache/commons/collections4/Predicate<TE;>;Lorg/apache/commons/collections4/Closure<TE;>;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchClosure", "switchClosure", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchMapClosure", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Closure;", "<E:Ljava/lang/Object;>(Ljava/util/Map<+TE;Lorg/apache/commons/collections4/Closure<TE;>;>;)Lorg/apache/commons/collections4/Closure<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The object and closure map must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Closure");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Closure");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Predicate");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/util/Map", "org/apache/commons/collections4/Closure", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Closure;", "[Lorg/apache/commons/collections4/Predicate;", Opcodes.INTEGER, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/EqualPredicate", "equalPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Closure");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/ClosureUtils", "switchClosure", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Closure;Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Closure;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
