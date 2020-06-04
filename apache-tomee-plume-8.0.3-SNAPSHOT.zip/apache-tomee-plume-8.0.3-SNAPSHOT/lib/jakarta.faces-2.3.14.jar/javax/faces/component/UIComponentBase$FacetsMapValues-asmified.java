package asm.javax.faces.component;
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
public class UIComponentBase$FacetsMapValuesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "javax/faces/component/UIComponentBase$FacetsMapValues", "Ljava/util/AbstractCollection<Ljavax/faces/component/UIComponent;>;", "java/util/AbstractCollection", null);

classWriter.visitInnerClass("javax/faces/component/UIComponentBase$FacetsMap", "javax/faces/component/UIComponentBase", "FacetsMap", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/faces/component/UIComponentBase$FacetsMapValues", "javax/faces/component/UIComponentBase", "FacetsMapValues", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/faces/component/UIComponentBase$FacetsMapValuesIterator", "javax/faces/component/UIComponentBase", "FacetsMapValuesIterator", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "map", "Ljavax/faces/component/UIComponentBase$FacetsMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/component/UIComponentBase$FacetsMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractCollection", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/UIComponentBase$FacetsMapValues", "map", "Ljavax/faces/component/UIComponentBase$FacetsMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljavax/faces/component/UIComponent;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAll", "(Ljava/util/Collection;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/UIComponentBase$FacetsMapValues", "map", "Ljavax/faces/component/UIComponentBase$FacetsMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponentBase$FacetsMap", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/UIComponentBase$FacetsMapValues", "map", "Ljavax/faces/component/UIComponentBase$FacetsMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponentBase$FacetsMap", "isEmpty", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljavax/faces/component/UIComponent;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIComponentBase$FacetsMapValuesIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/UIComponentBase$FacetsMapValues", "map", "Ljavax/faces/component/UIComponentBase$FacetsMap;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIComponentBase$FacetsMapValuesIterator", "<init>", "(Ljavax/faces/component/UIComponentBase$FacetsMap;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/UIComponentBase$FacetsMapValues", "map", "Ljavax/faces/component/UIComponentBase$FacetsMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponentBase$FacetsMap", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "add", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/UIComponent");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponentBase$FacetsMapValues", "add", "(Ljavax/faces/component/UIComponent;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
