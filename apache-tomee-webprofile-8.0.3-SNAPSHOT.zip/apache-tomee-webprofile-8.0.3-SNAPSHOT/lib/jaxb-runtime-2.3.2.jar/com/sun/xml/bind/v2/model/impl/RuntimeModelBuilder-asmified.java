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
public class RuntimeModelBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "Lcom/sun/xml/bind/v2/model/impl/ModelBuilder<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;", "com/sun/xml/bind/v2/model/impl/ModelBuilder", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder$IDTransducerImpl", "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "IDTransducerImpl", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;Ljava/util/Map;Ljava/lang/String;)V", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;Ljava/util/Map<Ljava/lang/Class;Ljava/lang/Class;>;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Utils", "REFLECTION_NAVIGATOR", "Lcom/sun/xml/bind/v2/model/nav/Navigator;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ModelBuilder", "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;Lcom/sun/xml/bind/v2/model/nav/Navigator;Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassInfo", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ModelBuilder", "getClassInfo", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/core/NonElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/runtime/RuntimeNonElement");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassInfo", "(Ljava/lang/Class;ZLcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ModelBuilder", "getClassInfo", "(Ljava/lang/Object;ZLcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/core/NonElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/runtime/RuntimeNonElement");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEnumLeafInfo", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/impl/RuntimeEnumLeafInfoImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/RuntimeEnumLeafInfoImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeEnumLeafInfoImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeModelBuilder;Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createClassInfo", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeModelBuilder;Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createElementInfo", "(Lcom/sun/xml/bind/v2/model/impl/RegistryInfoImpl;Ljava/lang/reflect/Method;)Lcom/sun/xml/bind/v2/model/impl/RuntimeElementInfoImpl;", "(Lcom/sun/xml/bind/v2/model/impl/RegistryInfoImpl<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;Ljava/lang/reflect/Method;)Lcom/sun/xml/bind/v2/model/impl/RuntimeElementInfoImpl;", new String[] { "com/sun/xml/bind/v2/runtime/IllegalAnnotationException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/RuntimeElementInfoImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeElementInfoImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeModelBuilder;Lcom/sun/xml/bind/v2/model/impl/RegistryInfoImpl;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createArrayInfo", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/reflect/Type;)Lcom/sun/xml/bind/v2/model/impl/RuntimeArrayInfoImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/RuntimeArrayInfoImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeArrayInfoImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeModelBuilder;Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTypeInfoSet", "()Lcom/sun/xml/bind/v2/model/impl/RuntimeTypeInfoSetImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/RuntimeTypeInfoSetImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "reader", "Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeTypeInfoSetImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "link", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfoSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ModelBuilder", "link", "()Lcom/sun/xml/bind/v2/model/core/TypeInfoSet;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfoSet");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createTransducer", "(Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElementRef;)Lcom/sun/xml/bind/v2/runtime/Transducer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeNonElementRef", "getTarget", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeNonElement", "getTransducer", "()Lcom/sun/xml/bind/v2/runtime/Transducer;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeNonElementRef", "getSource", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "id", "()Lcom/sun/xml/bind/v2/model/core/ID;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/core/ID", "IDREF", "Lcom/sun/xml/bind/v2/model/core/ID;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", "STRING", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"com/sun/xml/bind/v2/runtime/Transducer", "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "com/sun/xml/bind/v2/model/core/ID"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/core/ID", "ID", "Lcom/sun/xml/bind/v2/model/core/ID;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder$IDTransducerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder$IDTransducerImpl", "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "getExpectedMimeType", "()Ljavax/activation/MimeType;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;Ljavax/activation/MimeType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/activation/MimeType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "inlineBinaryData", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/InlineBinaryTransducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/InlineBinaryTransducer", "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "getSchemaType", "()Ljavax/xml/namespace/QName;", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "getSchemaType", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "createXSSimpleType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", "STRING", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/SchemaTypeTransducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo", "getSchemaType", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/SchemaTypeTransducer", "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "createXSSimpleType", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("anySimpleType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "link", "()Lcom/sun/xml/bind/v2/model/core/TypeInfoSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "link", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfoSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createArrayInfo", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/Object;)Lcom/sun/xml/bind/v2/model/impl/ArrayInfoImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "createArrayInfo", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/reflect/Type;)Lcom/sun/xml/bind/v2/model/impl/RuntimeArrayInfoImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createElementInfo", "(Lcom/sun/xml/bind/v2/model/impl/RegistryInfoImpl;Ljava/lang/Object;)Lcom/sun/xml/bind/v2/model/impl/ElementInfoImpl;", null, new String[] { "com/sun/xml/bind/v2/runtime/IllegalAnnotationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "createElementInfo", "(Lcom/sun/xml/bind/v2/model/impl/RegistryInfoImpl;Ljava/lang/reflect/Method;)Lcom/sun/xml/bind/v2/model/impl/RuntimeElementInfoImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createClassInfo", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "createClassInfo", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createEnumLeafInfo", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "createEnumLeafInfo", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/impl/RuntimeEnumLeafInfoImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getClassInfo", "(Ljava/lang/Object;ZLcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/core/NonElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "getClassInfo", "(Ljava/lang/Class;ZLcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getClassInfo", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/core/NonElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "getClassInfo", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createTypeInfoSet", "()Lcom/sun/xml/bind/v2/model/impl/TypeInfoSetImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeModelBuilder", "createTypeInfoSet", "()Lcom/sun/xml/bind/v2/model/impl/RuntimeTypeInfoSetImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
