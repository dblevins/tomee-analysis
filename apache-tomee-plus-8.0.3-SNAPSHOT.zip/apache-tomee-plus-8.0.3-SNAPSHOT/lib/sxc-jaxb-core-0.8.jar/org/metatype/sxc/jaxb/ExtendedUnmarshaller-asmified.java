package asm.org.metatype.sxc.jaxb;
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
public class ExtendedUnmarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/metatype/sxc/jaxb/ExtendedUnmarshaller", null, "java/lang/Object", new String[] { "jakarta/xml/bind/Unmarshaller" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Ljavax/xml/stream/XMLStreamReader;Ljava/lang/Class;Ljava/lang/Boolean;Lorg/metatype/sxc/jaxb/RuntimeContext;)Ljava/lang/Object;", "(Ljavax/xml/stream/XMLStreamReader;Ljava/lang/Class<*>;Ljava/lang/Boolean;Lorg/metatype/sxc/jaxb/RuntimeContext;)Ljava/lang/Object;", new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
