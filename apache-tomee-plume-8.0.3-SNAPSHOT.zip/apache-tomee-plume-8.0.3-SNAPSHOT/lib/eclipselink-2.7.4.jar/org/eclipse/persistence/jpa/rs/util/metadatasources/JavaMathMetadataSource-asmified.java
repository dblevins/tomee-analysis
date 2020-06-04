package asm.org.eclipse.persistence.jpa.rs.util.metadatasources;
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
public class JavaMathMetadataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jpa/rs/util/metadatasources/JavaMathMetadataSource", null, "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/metadata/MetadataSource" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/JavaMathMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/JavaMathMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitLdcInsn("java.math");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "setPackageName", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlBindings", "(Ljava/util/Map;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", "(Ljava/util/Map<Ljava/lang/String;*>;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/JavaMathMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
