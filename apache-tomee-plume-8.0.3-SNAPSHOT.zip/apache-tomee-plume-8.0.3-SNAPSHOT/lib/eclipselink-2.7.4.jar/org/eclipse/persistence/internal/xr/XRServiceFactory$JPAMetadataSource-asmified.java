package asm.org.eclipse.persistence.internal.xr;
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
public class XRServiceFactory$JPAMetadataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/xr/XRServiceFactory$JPAMetadataSource", null, "java/lang/Object", new String[] { "org/eclipse/persistence/jpa/metadata/MetadataSource" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/xr/XRServiceFactory$JPAMetadataSource", "org/eclipse/persistence/internal/xr/XRServiceFactory", "JPAMetadataSource", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "xrdecl", "Lorg/eclipse/persistence/internal/xr/XRDynamicClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "reader", "Ljava/io/Reader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/xr/XRDynamicClassLoader;Ljava/io/Reader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/xr/XRServiceFactory$JPAMetadataSource", "xrdecl", "Lorg/eclipse/persistence/internal/xr/XRDynamicClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/xr/XRServiceFactory$JPAMetadataSource", "reader", "Ljava/io/Reader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPropertyOverrides", "(Ljava/util/Map;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Ljava/util/Map;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityMappings", "(Ljava/util/Map;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("orm-mappings");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/xr/XRServiceFactory$JPAMetadataSource", "reader", "Ljava/io/Reader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/xr/XRServiceFactory$JPAMetadataSource", "xrdecl", "Lorg/eclipse/persistence/internal/xr/XRDynamicClassLoader;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "read", "(Ljava/lang/String;Ljava/io/Reader;Ljava/lang/ClassLoader;Ljava/util/Map;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
