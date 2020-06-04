package asm.org.apache.cxf.jaxrs.json.basic;
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
public class JsonMapObjectReaderWriter$OutputDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output", "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter", "Output", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "append", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "append", "(C)Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
