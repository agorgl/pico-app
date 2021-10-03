# Extensions
load('ext://podman', 'podman_build')
load('ext://dotenv', 'dotenv')

# Load environment file
dotenv()

# Set the default registry
default_registry(os.getenv('REGISTRY'))

# Allow deployment to default namespace
allow_k8s_contexts('default')

# Iterate on all projects
projects = os.getenv('PROJECTS').split(',')
for p in projects:
  # Deploy: tell Tilt what YAML to deploy
  manifests_dir = os.path.join(p, 'k8s')
  manifests = [os.path.relpath(m) for m in listdir(manifests_dir)]
  for m in manifests:
    k8s_yaml(m)

  # Build: tell Tilt what images to build from which directories
  podman_build(p, p, extra_flags=['--arch', os.getenv('ARCH')])