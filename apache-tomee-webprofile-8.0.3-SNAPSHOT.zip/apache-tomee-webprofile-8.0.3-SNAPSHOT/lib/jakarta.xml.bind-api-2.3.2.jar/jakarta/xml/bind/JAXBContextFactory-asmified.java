package asm.jakarta.xml.bind;
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
public class JAXBContextFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/xml/bind/JAXBContextFactory", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createContext", "([Ljava/lang/Class;Ljava/util/Map;)Ljakarta/xml/bind/JAXBContext;", "([Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/xml/bind/JAXBContext;", new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createContext", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/util/Map;)Ljakarta/xml/bind/JAXBContext;", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/xml/bind/JAXBContext;", new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
