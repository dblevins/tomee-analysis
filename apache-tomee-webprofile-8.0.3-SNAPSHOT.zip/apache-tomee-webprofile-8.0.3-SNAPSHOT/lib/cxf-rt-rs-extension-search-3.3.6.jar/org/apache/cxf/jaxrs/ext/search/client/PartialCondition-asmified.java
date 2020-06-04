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
public class PartialConditionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/jaxrs/ext/search/client/PartialCondition", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "is", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/Property;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "and", "(Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;[Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "or", "(Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;[Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "and", "(Ljava/util/List;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", "(Ljava/util/List<Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;>;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "or", "(Ljava/util/List;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", "(Ljava/util/List<Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;>;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
