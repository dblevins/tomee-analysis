package asm.org.eclipse.persistence.jaxb.compiler.builder;
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
public class TransformerPropertyBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation", "XmlWriteTransformer", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "property", "Lorg/eclipse/persistence/jaxb/compiler/Property;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeInfo", "Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "helper", "Lorg/eclipse/persistence/jaxb/javamodel/Helper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "attributeToken", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/jaxb/compiler/Property;Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/javamodel/Helper;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "property", "Lorg/eclipse/persistence/jaxb/compiler/Property;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "typeInfo", "Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "helper", "Lorg/eclipse/persistence/jaxb/javamodel/Helper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "attributeToken", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildProperties", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/jaxb/compiler/Property;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "property", "Lorg/eclipse/persistence/jaxb/compiler/Property;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/Property", "getXmlTransformation", "()Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation", "getXmlWriteTransformer", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "java/util/List", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "property", "Lorg/eclipse/persistence/jaxb/compiler/Property;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "getPropertyName", "(Lorg/eclipse/persistence/jaxb/compiler/Property;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "typeInfo", "Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "buildPropertyFromTransformer", "(Ljava/lang/String;Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Lorg/eclipse/persistence/jaxb/compiler/Property;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getPropertyName", "(Lorg/eclipse/persistence/jaxb/compiler/Property;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "getXmlPath", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/Property", "getPropertyName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "attributeToken", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/compiler/XMLProcessor", "getNameFromXPath", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "buildPropertyFromTransformer", "(Ljava/lang/String;Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Lorg/eclipse/persistence/jaxb/compiler/Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/compiler/Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "helper", "Lorg/eclipse/persistence/jaxb/javamodel/Helper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/Property", "<init>", "(Lorg/eclipse/persistence/jaxb/javamodel/Helper;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/Property", "setPropertyName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "getXmlPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/Property", "setXmlPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/Property", "setSchemaName", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "getReturnTypeFromTransformer", "(Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/Property", "setType", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getReturnTypeFromTransformer", "(Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "getTransformerJavaClass", "(Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "isSetTransformerClass", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "getTransformerReflectionHelper", "()Lorg/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper", "getReturnTypeForWriteTransformationMethodTransformer", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/jaxb/javamodel/JavaClass"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "getTransformerReflectionHelper", "()Lorg/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "getMethod", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper", "getReturnTypeForWriteTransformationMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTransformerJavaClass", "(Lorg/eclipse/persistence/jaxb/compiler/TypeInfo;Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/eclipse/persistence/exceptions/JAXBException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "isSetTransformerClass", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "helper", "Lorg/eclipse/persistence/jaxb/javamodel/Helper;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "getTransformerClass", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/Helper", "getJavaClass", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/exceptions/JAXBException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlTransformation$XmlWriteTransformer", "getTransformerClass", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "transformerClassNotFound", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "helper", "Lorg/eclipse/persistence/jaxb/javamodel/Helper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/compiler/TypeInfo", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/Helper", "getJavaClass", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTransformerReflectionHelper", "()Lorg/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/compiler/builder/TransformerPropertyBuilder", "helper", "Lorg/eclipse/persistence/jaxb/javamodel/Helper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/builder/helper/TransformerReflectionHelper", "<init>", "(Lorg/eclipse/persistence/jaxb/javamodel/Helper;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
