package asm.com.sun.xml.bind.v2.model.annotation;
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
public class AnnotationReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/annotation/AnnotationReader", "<T:Ljava/lang/Object;C:Ljava/lang/Object;F:Ljava/lang/Object;M:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setErrorHandler", "(Lcom/sun/xml/bind/v2/model/core/ErrorHandler;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;TF;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)TA;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasFieldAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;TF;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasClassAnnotation", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "(TC;Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllFieldAnnotations", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)[Ljava/lang/annotation/Annotation;", "(TF;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)[Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethodAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;TM;TM;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)TA;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasMethodAnnotation", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Ljava/lang/String;TM;TM;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllMethodAnnotations", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)[Ljava/lang/annotation/Annotation;", "(TM;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)[Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethodAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;TM;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)TA;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasMethodAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;TM;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethodParameterAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;ILcom/sun/xml/bind/v2/model/annotation/Locatable;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;TM;ILcom/sun/xml/bind/v2/model/annotation/Locatable;)TA;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;TC;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)TA;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPackageAnnotation", "(Ljava/lang/Class;Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;TC;Lcom/sun/xml/bind/v2/model/annotation/Locatable;)TA;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassValue", "(Ljava/lang/annotation/Annotation;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/annotation/Annotation;Ljava/lang/String;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassArrayValue", "(Ljava/lang/annotation/Annotation;Ljava/lang/String;)[Ljava/lang/Object;", "(Ljava/lang/annotation/Annotation;Ljava/lang/String;)[TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
