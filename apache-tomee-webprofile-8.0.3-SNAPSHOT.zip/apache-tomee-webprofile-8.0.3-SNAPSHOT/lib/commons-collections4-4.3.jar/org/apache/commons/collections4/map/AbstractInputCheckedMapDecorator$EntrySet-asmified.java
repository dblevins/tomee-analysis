package asm.org.apache.commons.collections4.map;
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
public class AbstractInputCheckedMapDecorator$EntrySetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "Lorg/apache/commons/collections4/set/AbstractSetDecorator<Ljava/util/Map$Entry<TK;TV;>;>;", "org/apache/commons/collections4/set/AbstractSetDecorator", null);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator", "EntrySet", ACC_PRIVATE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySetIterator", "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator", "EntrySetIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$MapEntry", "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator", "MapEntry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(4354731610923110264L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;Ljava/util/Set;Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;)V", "(Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "this$0", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/set/AbstractSetDecorator", "<init>", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "parent", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySetIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "this$0", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "decorated", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "parent", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySetIterator", "<init>", "(Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;Ljava/util/Iterator;Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toArray", "()[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "decorated", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "()[Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/Object;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$MapEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "this$0", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "parent", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$MapEntry", "<init>", "(Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;Ljava/util/Map$Entry;Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "<T:Ljava/lang/Object;>([TT;)[TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getComponentType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "newInstance", "(Ljava/lang/Class;I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/Object;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "decorated", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$MapEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "this$0", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$EntrySet", "parent", "Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator$MapEntry", "<init>", "(Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;Ljava/util/Map$Entry;Lorg/apache/commons/collections4/map/AbstractInputCheckedMapDecorator;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
