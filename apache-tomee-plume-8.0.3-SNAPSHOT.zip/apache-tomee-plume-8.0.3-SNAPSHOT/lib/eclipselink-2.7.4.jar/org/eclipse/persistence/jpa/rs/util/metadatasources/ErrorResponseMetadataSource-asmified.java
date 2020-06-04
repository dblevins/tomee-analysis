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
public class ErrorResponseMetadataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jpa/rs/util/metadatasources/ErrorResponseMetadataSource", null, "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/metadata/MetadataSource" });

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "JavaTypes", ACC_PUBLIC | ACC_STATIC);

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
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/ErrorResponseMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/ErrorResponseMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jpa/rs/exceptions/ErrorResponse;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getPackage", "()Ljava/lang/Package;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Package", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "setPackageName", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/ErrorResponseMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "setJavaTypes", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/JavaType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jpa/rs/exceptions/ErrorResponse;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "getJavaType", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlBindings", "(Ljava/util/Map;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", "(Ljava/util/Map<Ljava/lang/String;*>;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/ErrorResponseMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
