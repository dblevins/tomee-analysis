package asm.org.apache.commons.collections4.functors;
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
public class SwitchTransformerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/functors/SwitchTransformer", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/collections4/Transformer<TI;TO;>;Ljava/io/Serializable;", "java/lang/Object", new String[] { "org/apache/commons/collections4/Transformer", "java/io/Serializable" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-6404460890903469332L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iPredicates", "[Lorg/apache/commons/collections4/Predicate;", "[Lorg/apache/commons/collections4/Predicate<-TI;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iTransformers", "[Lorg/apache/commons/collections4/Transformer;", "[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iDefault", "Lorg/apache/commons/collections4/Transformer;", "Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchTransformer", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TI;>;[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FunctorUtils", "validate", "([Lorg/apache/commons/collections4/Predicate;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FunctorUtils", "validate", "([Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The predicate and transformer arrays must be the same size");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ConstantTransformer", "nullTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/commons/collections4/Transformer"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/SwitchTransformer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/SwitchTransformer", "<init>", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "switchTransformer", "(Ljava/util/Map;)Lorg/apache/commons/collections4/Transformer;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/util/Map<+Lorg/apache/commons/collections4/Predicate<-TI;>;+Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;>;)Lorg/apache/commons/collections4/Transformer<TI;TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The predicate and transformer map must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ConstantTransformer", "nullTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
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
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ConstantTransformer", "nullTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/commons/collections4/Transformer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/commons/collections4/Transformer"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
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
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/util/Map", "org/apache/commons/collections4/Transformer", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Transformer;", "[Lorg/apache/commons/collections4/Predicate;", Opcodes.INTEGER, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Predicate");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Transformer");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/SwitchTransformer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/SwitchTransformer", "<init>", "(Z[Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Z[Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V", "(Z[Lorg/apache/commons/collections4/Predicate<-TI;>;[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FunctorUtils", "copy", "([Lorg/apache/commons/collections4/Predicate;)[Lorg/apache/commons/collections4/Predicate;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Predicate;", "[Lorg/apache/commons/collections4/Transformer;", "org/apache/commons/collections4/Transformer"}, 1, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Predicate;", "[Lorg/apache/commons/collections4/Transformer;", "org/apache/commons/collections4/Transformer"}, 2, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", "[Lorg/apache/commons/collections4/Predicate;"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iPredicates", "[Lorg/apache/commons/collections4/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FunctorUtils", "copy", "([Lorg/apache/commons/collections4/Transformer;)[Lorg/apache/commons/collections4/Transformer;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Predicate;", "[Lorg/apache/commons/collections4/Transformer;", "org/apache/commons/collections4/Transformer"}, 2, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", "[Lorg/apache/commons/collections4/Transformer;"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iTransformers", "[Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ConstantTransformer", "nullTransformer", "()Lorg/apache/commons/collections4/Transformer;", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer"});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", Opcodes.INTEGER, "[Lorg/apache/commons/collections4/Predicate;", "[Lorg/apache/commons/collections4/Transformer;", "org/apache/commons/collections4/Transformer"}, 2, new Object[] {"org/apache/commons/collections4/functors/SwitchTransformer", "org/apache/commons/collections4/Transformer"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iDefault", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V", "([Lorg/apache/commons/collections4/Predicate<-TI;>;[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/SwitchTransformer", "<init>", "(Z[Lorg/apache/commons/collections4/Predicate;[Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TI;)TO;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iPredicates", "[Lorg/apache/commons/collections4/Predicate;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iPredicates", "[Lorg/apache/commons/collections4/Predicate;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Predicate", "evaluate", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iTransformers", "[Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Transformer", "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iDefault", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Transformer", "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPredicates", "()[Lorg/apache/commons/collections4/Predicate;", "()[Lorg/apache/commons/collections4/Predicate<-TI;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iPredicates", "[Lorg/apache/commons/collections4/Predicate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FunctorUtils", "copy", "([Lorg/apache/commons/collections4/Predicate;)[Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransformers", "()[Lorg/apache/commons/collections4/Transformer;", "()[Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iTransformers", "[Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FunctorUtils", "copy", "([Lorg/apache/commons/collections4/Transformer;)[Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultTransformer", "()Lorg/apache/commons/collections4/Transformer;", "()Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/functors/SwitchTransformer", "iDefault", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
