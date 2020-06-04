package asm.org.apache.johnzon.jaxrs.jsonb.jaxrs;
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
public class JsonbJaxrsProvider$ReadImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$ReadImpl", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$ReadImpl", "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider", "ReadImpl", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRead", "(Ljakarta/json/bind/Jsonb;Ljava/lang/reflect/Type;Ljava/io/InputStream;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
