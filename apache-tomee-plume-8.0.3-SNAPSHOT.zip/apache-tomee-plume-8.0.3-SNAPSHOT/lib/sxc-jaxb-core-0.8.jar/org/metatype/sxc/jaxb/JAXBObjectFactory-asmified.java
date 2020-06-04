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
public class JAXBObjectFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/metatype/sxc/jaxb/JAXBObjectFactory", "<T:Ljava/lang/Object;>Lorg/metatype/sxc/jaxb/JAXBClass<TT;>;", "org/metatype/sxc/jaxb/JAXBClass", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/Class;[Ljava/lang/Class;)V", "(Ljava/lang/Class<TT;>;[Ljava/lang/Class<+Lorg/metatype/sxc/jaxb/JAXBClass;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/JAXBClass", "<init>", "(Ljava/lang/Class;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRootElements", "()Ljava/util/Map;", "()Ljava/util/Map<Ljavax/xml/namespace/QName;Ljava/lang/Class<+Lorg/metatype/sxc/jaxb/JAXBObject;>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
