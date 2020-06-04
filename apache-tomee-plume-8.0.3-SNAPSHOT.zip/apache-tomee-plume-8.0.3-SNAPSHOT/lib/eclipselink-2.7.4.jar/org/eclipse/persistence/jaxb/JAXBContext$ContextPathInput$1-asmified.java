package asm.org.eclipse.persistence.jaxb;
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
public class JAXBContext$ContextPathInput$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", "Ljava/lang/Object;Ljava/security/PrivilegedAction<Lorg/eclipse/persistence/internal/jaxb/JaxbClassLoader;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitOuterClass("org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput", "createContextState", "([Ljava/lang/Class;Ljava/util/Map;)Lorg/eclipse/persistence/jaxb/JAXBContext$JAXBContextState;");

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput", "org/eclipse/persistence/jaxb/JAXBContext", "ContextPathInput", ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/JAXBContext$JAXBContextState", "org/eclipse/persistence/jaxb/JAXBContext", "JAXBContextState", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/eclipse/persistence/jaxb/JAXBContext$ContextPathInput;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$classesToBeBound", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/jaxb/JAXBContext$ContextPathInput;[Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", "this$1", "Lorg/eclipse/persistence/jaxb/JAXBContext$ContextPathInput;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", "val$classesToBeBound", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Lorg/eclipse/persistence/internal/jaxb/JaxbClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/JaxbClassLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", "this$1", "Lorg/eclipse/persistence/jaxb/JAXBContext$ContextPathInput;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput", "classLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", "val$classesToBeBound", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/JaxbClassLoader", "<init>", "(Ljava/lang/ClassLoader;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/JAXBContext$ContextPathInput$1", "run", "()Lorg/eclipse/persistence/internal/jaxb/JaxbClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
