package asm.org.eclipse.persistence.internal.jpa.config.persistenceunit;
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
public class MetadataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/config/persistenceunit/MetadataSource", null, "org/eclipse/persistence/jpa/metadata/XMLMetadataSource", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "persistenceUnit", "Lorg/eclipse/persistence/internal/jpa/config/persistenceunit/PersistenceUnitImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/jpa/config/PersistenceUnit;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/metadata/XMLMetadataSource", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/config/persistenceunit/PersistenceUnitImpl");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/config/persistenceunit/MetadataSource", "persistenceUnit", "Lorg/eclipse/persistence/internal/jpa/config/persistenceunit/PersistenceUnitImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityMappings", "(Ljava/util/Map;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/config/persistenceunit/MetadataSource", "persistenceUnit", "Lorg/eclipse/persistence/internal/jpa/config/persistenceunit/PersistenceUnitImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/config/persistenceunit/PersistenceUnitImpl", "getMappings", "()Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
