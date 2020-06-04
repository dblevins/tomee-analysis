package asm.com.fasterxml.jackson.databind.jsonFormatVisitors;
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
public class JsonNumberFormatVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonNumberFormatVisitor", null, "java/lang/Object", new String[] { "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormatVisitor" });

classWriter.visitInnerClass("com/fasterxml/jackson/databind/jsonFormatVisitors/JsonNumberFormatVisitor$Base", "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonNumberFormatVisitor", "Base", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonParser$NumberType", "com/fasterxml/jackson/core/JsonParser", "NumberType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberType", "(Lcom/fasterxml/jackson/core/JsonParser$NumberType;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
