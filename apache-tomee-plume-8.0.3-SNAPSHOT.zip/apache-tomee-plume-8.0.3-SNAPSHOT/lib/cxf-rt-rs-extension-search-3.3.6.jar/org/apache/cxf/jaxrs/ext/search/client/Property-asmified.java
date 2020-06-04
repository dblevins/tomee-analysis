package asm.org.apache.cxf.jaxrs.ext.search.client;
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
public class PropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/jaxrs/ext/search/client/Property", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "equalTo", "(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "equalTo", "(Ljava/lang/Double;[Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "equalTo", "(Ljava/lang/Long;[Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "equalTo", "(Ljava/lang/Integer;[Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "equalTo", "(Ljava/util/Date;[Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "equalTo", "(Ljavax/xml/datatype/Duration;[Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqualTo", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqualTo", "(Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqualTo", "(Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqualTo", "(Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqualTo", "(Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqualTo", "(Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterOrEqualTo", "(Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterOrEqualTo", "(Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterOrEqualTo", "(Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessOrEqualTo", "(Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessOrEqualTo", "(Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessOrEqualTo", "(Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "after", "(Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "before", "(Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notBefore", "(Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notAfter", "(Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "after", "(Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "before", "(Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notAfter", "(Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notBefore", "(Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lexicalAfter", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lexicalBefore", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lexicalNotBefore", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lexicalNotAfter", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "comparesTo", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "comparesTo", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljava/lang/Double;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "comparesTo", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljava/lang/Long;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "comparesTo", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljava/lang/Integer;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "comparesTo", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljava/util/Date;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "comparesTo", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljavax/xml/datatype/Duration;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
