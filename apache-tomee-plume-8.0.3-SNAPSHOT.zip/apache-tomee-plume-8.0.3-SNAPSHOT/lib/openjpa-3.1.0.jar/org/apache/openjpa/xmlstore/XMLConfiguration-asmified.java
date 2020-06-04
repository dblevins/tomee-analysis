package asm.org.apache.openjpa.xmlstore;
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
public class XMLConfigurationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/xmlstore/XMLConfiguration", null, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_store", "Lorg/apache/openjpa/xmlstore/XMLStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_handler", "Lorg/apache/openjpa/xmlstore/XMLFileHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "<init>", "(ZZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("version");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("version");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/conf/ProductDerivations", "beforeConfigurationLoad", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/xmlstore/XMLConfiguration", "loadGlobals", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getFileHandler", "()Lorg/apache/openjpa/xmlstore/XMLFileHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "_handler", "Lorg/apache/openjpa/xmlstore/XMLFileHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/xmlstore/XMLFileHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/xmlstore/XMLFileHandler", "<init>", "(Lorg/apache/openjpa/xmlstore/XMLConfiguration;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "_handler", "Lorg/apache/openjpa/xmlstore/XMLFileHandler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "_handler", "Lorg/apache/openjpa/xmlstore/XMLFileHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getStore", "()Lorg/apache/openjpa/xmlstore/XMLStore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "_store", "Lorg/apache/openjpa/xmlstore/XMLStore;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/xmlstore/XMLStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/xmlstore/XMLStore", "<init>", "(Lorg/apache/openjpa/xmlstore/XMLConfiguration;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "_store", "Lorg/apache/openjpa/xmlstore/XMLStore;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/xmlstore/XMLConfiguration", "_store", "Lorg/apache/openjpa/xmlstore/XMLStore;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
