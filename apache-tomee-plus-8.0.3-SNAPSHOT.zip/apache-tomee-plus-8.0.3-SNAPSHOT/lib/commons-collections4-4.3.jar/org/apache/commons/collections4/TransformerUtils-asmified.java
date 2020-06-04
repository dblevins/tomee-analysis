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
public class TransformerUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/TransformerUtils", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "exceptionTransformer", "()Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ExceptionTransformer", "exceptionTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullTransformer", "()Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ConstantTransformer", "nullTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nopTransformer", "()Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Transformer<TT;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NOPTransformer", "nopTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cloneTransformer", "()Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Transformer<TT;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/CloneTransformer", "cloneTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "constantTransformer", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(TO;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ConstantTransformer", "constantTransformer", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "asTransformer", "(Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Closure<-TT;>;)Lorg/apache/commons/collections4/Transformer<TT;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ClosureTransformer", "closureTransformer", "(Lorg/apache/commons/collections4/Closure;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "asTransformer", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Transformer<TT;Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/PredicateTransformer", "predicateTransformer", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "asTransformer", "(Lorg/apache/commons/collections4/Factory;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Factory<+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FactoryTransformer", "factoryTransformer", "(Lorg/apache/commons/collections4/Factory;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "chainedTransformer", "([Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Transformer<-TT;+TT;>;)Lorg/apache/commons/collections4/Transformer<TT;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ChainedTransformer", "chainedTransformer", "([Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "chainedTransformer", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<+Lorg/apache/commons/collections4/Transformer<-TT;+TT;>;>;)Lorg/apache/commons/collections4/Transformer<TT;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ChainedTransformer", "chainedTransformer", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "ifTransformer", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;Lorg/apache/commons/collections4/Transformer<-TT;+TT;>;)Lorg/apache/commons/collections4/Transformer<TT;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/IfTransformer", "ifTransformer", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "ifTransformer", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TI;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/IfTransformer", "ifTransformer", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "switchTransformer", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TI;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Predicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Transformer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchTransformer", "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TI;>;[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchTransformer", "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TI;>;[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchTransformer", "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchTransformer", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/util/Map<Lorg/apache/commons/collections4/Predicate<TI;>;Lorg/apache/commons/collections4/Transformer<TI;TO;>;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/SwitchTransformer", "switchTransformer", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchMapTransformer", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/util/Map<TI;Lorg/apache/commons/collections4/Transformer<TI;TO;>;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The object and transformer map must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Transformer");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Transformer");
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
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/util/Map", "org/apache/commons/collections4/Transformer", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Transformer;", "[Lorg/apache/commons/collections4/Predicate;", Opcodes.INTEGER, "java/util/Iterator"}, 0, new Object[] {});
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
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Transformer");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/TransformerUtils", "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instantiateTransformer", "()Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Transformer<Ljava/lang/Class<+TT;>;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InstantiateTransformer", "instantiateTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instantiateTransformer", "([Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>([Ljava/lang/Class<*>;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer<Ljava/lang/Class<+TT;>;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InstantiateTransformer", "instantiateTransformer", "([Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mapTransformer", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/util/Map<-TI;+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/MapTransformer", "mapTransformer", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerTransformer", "(Ljava/lang/String;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InvokerTransformer", "invokerTransformer", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerTransformer", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InvokerTransformer", "invokerTransformer", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "stringValueTransformer", "()Lorg/apache/commons/collections4/Transformer;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Transformer<TT;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/StringValueTransformer", "stringValueTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
