package asm.com.sun.xml.bind.v2.model.impl;
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
public class ArrayInfoImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "<TypeT:Ljava/lang/Object;ClassDeclT:Ljava/lang/Object;FieldT:Ljava/lang/Object;MethodT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/model/impl/TypeInfoImpl<TTypeT;TClassDeclT;TFieldT;TMethodT;>;Lcom/sun/xml/bind/v2/model/core/ArrayInfo<TTypeT;TClassDeclT;>;Lcom/sun/xml/bind/v2/runtime/Location;", "com/sun/xml/bind/v2/model/impl/TypeInfoImpl", new String[] { "com/sun/xml/bind/v2/model/core/ArrayInfo", "com/sun/xml/bind/v2/runtime/Location" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "itemType", "Lcom/sun/xml/bind/v2/model/core/NonElement;", "Lcom/sun/xml/bind/v2/model/core/NonElement<TTypeT;TClassDeclT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeName", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "arrayType", "Ljava/lang/Object;", "TTypeT;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/ModelBuilder;Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/Object;)V", "(Lcom/sun/xml/bind/v2/model/impl/ModelBuilder<TTypeT;TClassDeclT;TFieldT;TMethodT;>;Lcom/sun/xml/bind/v2/model/annotation/Locatable;TTypeT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/TypeInfoImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/ModelBuilder;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "arrayType", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "nav", "()Lcom/sun/xml/bind/v2/model/nav/Navigator;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/nav/Navigator", "getComponentType", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/ModelBuilder", "getTypeInfo", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/core/NonElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "itemType", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "itemType", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/NonElement", "getTypeName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/IllegalAnnotationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANONYMOUS_ARRAY_ITEM", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "nav", "()Lcom/sun/xml/bind/v2/model/nav/Navigator;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/nav/Navigator", "getTypeName", "(Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/IllegalAnnotationException", "<init>", "(Ljava/lang/String;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/ModelBuilder", "reportError", "(Lcom/sun/xml/bind/v2/runtime/IllegalAnnotationException;)V", false);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("#dummy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "com/sun/xml/bind/v2/model/impl/ModelBuilder", "com/sun/xml/bind/v2/model/annotation/Locatable", "java/lang/Object", "java/lang/Object", "javax/xml/namespace/QName"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/util/ArrayInfoUtil", "calcArrayTypeName", "(Ljavax/xml/namespace/QName;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "typeName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getItemType", "()Lcom/sun/xml/bind/v2/model/core/NonElement;", "()Lcom/sun/xml/bind/v2/model/core/NonElement<TTypeT;TClassDeclT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "itemType", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "typeName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSimpleType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/Object;", "()TTypeT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "arrayType", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_DEPRECATED, "canBeReferencedByIDREF", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocation", "()Lcom/sun/xml/bind/v2/runtime/Location;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "nav", "()Lcom/sun/xml/bind/v2/model/nav/Navigator;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ArrayInfoImpl", "arrayType", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/nav/Navigator", "getTypeName", "(Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getUpstream", "()Lcom/sun/xml/bind/v2/model/annotation/Locatable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/TypeInfoImpl", "getUpstream", "()Lcom/sun/xml/bind/v2/model/annotation/Locatable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
