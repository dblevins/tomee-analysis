package asm.org.eclipse.persistence.jaxb.dynamic;
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
public class DynamicJAXBContext$DynamicJAXBContextInput$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput$1", "Ljava/lang/Object;Ljava/security/PrivilegedAction<Lorg/eclipse/persistence/dynamic/DynamicClassLoader;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitOuterClass("org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput", "<init>", "(Ljava/util/Map;Ljava/lang/ClassLoader;)V");

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput", "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext", "DynamicJAXBContextInput", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$parent", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput;Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput$1", "this$1", "Lorg/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput$1", "val$parent", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Lorg/eclipse/persistence/dynamic/DynamicClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/dynamic/DynamicClassLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/JaxbClassLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput$1", "val$parent", "Ljava/lang/ClassLoader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/JaxbClassLoader", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/dynamic/DynamicClassLoader", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput$1", "run", "()Lorg/eclipse/persistence/dynamic/DynamicClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
