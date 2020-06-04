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
public class ValuePropertyInfoImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/ValuePropertyInfoImpl", "<TypeT:Ljava/lang/Object;ClassDeclT:Ljava/lang/Object;FieldT:Ljava/lang/Object;MethodT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/model/impl/SingleTypePropertyInfoImpl<TTypeT;TClassDeclT;TFieldT;TMethodT;>;Lcom/sun/xml/bind/v2/model/core/ValuePropertyInfo<TTypeT;TClassDeclT;>;", "com/sun/xml/bind/v2/model/impl/SingleTypePropertyInfoImpl", new String[] { "com/sun/xml/bind/v2/model/core/ValuePropertyInfo" });

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;Lcom/sun/xml/bind/v2/model/impl/PropertySeed;)V", "(Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl<TTypeT;TClassDeclT;TFieldT;TMethodT;>;Lcom/sun/xml/bind/v2/model/impl/PropertySeed<TTypeT;TClassDeclT;TFieldT;TMethodT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/SingleTypePropertyInfoImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;Lcom/sun/xml/bind/v2/model/impl/PropertySeed;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "kind", "()Lcom/sun/xml/bind/v2/model/core/PropertyKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/core/PropertyKind", "VALUE", "Lcom/sun/xml/bind/v2/model/core/PropertyKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
