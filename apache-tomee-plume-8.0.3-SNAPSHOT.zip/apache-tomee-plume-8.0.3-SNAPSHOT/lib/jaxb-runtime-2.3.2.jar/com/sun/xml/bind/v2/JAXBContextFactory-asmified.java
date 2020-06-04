package asm.com.sun.xml.bind.v2;
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

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/bind/v2/JAXBContextFactory", null, "java/lang/Object", new String[] { "javax/xml/bind/JAXBContextFactory" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContext", "([Ljava/lang/Class;Ljava/util/Map;)Ljavax/xml/bind/JAXBContext;", "([Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/xml/bind/JAXBContext;", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/ContextFactory", "createContext", "([Ljava/lang/Class;Ljava/util/Map;)Ljavax/xml/bind/JAXBContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContext", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/util/Map;)Ljavax/xml/bind/JAXBContext;", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/xml/bind/JAXBContext;", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/ContextFactory", "createContext", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/util/Map;)Ljavax/xml/bind/JAXBContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
