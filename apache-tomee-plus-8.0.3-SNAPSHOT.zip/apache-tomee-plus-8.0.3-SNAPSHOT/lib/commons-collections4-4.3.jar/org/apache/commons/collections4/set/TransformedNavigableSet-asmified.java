package asm.org.apache.commons.collections4.set;
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
public class TransformedNavigableSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/set/TransformedNavigableSet", "<E:Ljava/lang/Object;>Lorg/apache/commons/collections4/set/TransformedSortedSet<TE;>;Ljava/util/NavigableSet<TE;>;", "org/apache/commons/collections4/set/TransformedSortedSet", new String[] { "java/util/NavigableSet" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(20150528L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformingNavigableSet", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedNavigableSet;", "<E:Ljava/lang/Object;>(Ljava/util/NavigableSet<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;+TE;>;)Lorg/apache/commons/collections4/set/TransformedNavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/set/TransformedNavigableSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "<init>", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedNavigableSet", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedNavigableSet;", "<E:Ljava/lang/Object;>(Ljava/util/NavigableSet<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;+TE;>;)Lorg/apache/commons/collections4/set/TransformedNavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/set/TransformedNavigableSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "<init>", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "size", "()I", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "toArray", "()[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/util/NavigableSet", "org/apache/commons/collections4/Transformer", "org/apache/commons/collections4/set/TransformedNavigableSet", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Transformer", "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"java/util/NavigableSet", "org/apache/commons/collections4/Transformer", "org/apache/commons/collections4/set/TransformedNavigableSet"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)V", "(Ljava/util/NavigableSet<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;+TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/set/TransformedSortedSet", "<init>", "(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "decorated", "()Ljava/util/NavigableSet;", "()Ljava/util/NavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/set/TransformedSortedSet", "decorated", "()Ljava/util/Collection;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/NavigableSet");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lower", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TE;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "lower", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "floor", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TE;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "floor", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ceiling", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TE;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "ceiling", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "higher", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TE;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "higher", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pollFirst", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "pollFirst", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pollLast", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "pollLast", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "descendingSet", "()Ljava/util/NavigableSet;", "()Ljava/util/NavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "descendingSet", "()Ljava/util/NavigableSet;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformer", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformingNavigableSet", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedNavigableSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "descendingIterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "descendingIterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subSet", "(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;", "(TE;ZTE;Z)Ljava/util/NavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "subSet", "(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformer", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformingNavigableSet", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedNavigableSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "headSet", "(Ljava/lang/Object;Z)Ljava/util/NavigableSet;", "(TE;Z)Ljava/util/NavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "headSet", "(Ljava/lang/Object;Z)Ljava/util/NavigableSet;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformer", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformingNavigableSet", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedNavigableSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tailSet", "(Ljava/lang/Object;Z)Ljava/util/NavigableSet;", "(TE;Z)Ljava/util/NavigableSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/NavigableSet", "tailSet", "(Ljava/lang/Object;Z)Ljava/util/NavigableSet;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformer", "Lorg/apache/commons/collections4/Transformer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/set/TransformedNavigableSet", "transformingNavigableSet", "(Ljava/util/NavigableSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedNavigableSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "decorated", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/set/TransformedNavigableSet", "decorated", "()Ljava/util/NavigableSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
